package com.mathpar.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mathpar.func.Page;
import com.mathpar.web.db.dao.DbTasks;
import com.mathpar.web.entity.MathparNotebook;
import com.mathpar.web.entity.TaskInEduPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "/api/tasks")
public class Tasks {
    private DbTasks dbTasks;

    @Autowired
    public void setDbTasks(DbTasks dbTasks) {
        this.dbTasks = dbTasks;
    }


    @ResponseBody
    @RequestMapping(value = "/plan", method = RequestMethod.GET)
    public List<TaskInEduPlan> getPlanForCurrentUser(@PageParam Page page) {
        return dbTasks.getPlanForUser(page.getUserId());
    }

    @ResponseBody
    @RequestMapping(value = "/{taskId}", method = RequestMethod.GET)
    public MathparNotebook getAllSubtasks(@PathVariable("taskId") long taskId) throws IOException {
        return dbTasks.getTasks(taskId);
    }

    @RequestMapping(value = "/{groupId}/new_task", method = RequestMethod.GET)
    public ModelAndView newTask() {
        return new ModelAndView("tasks");
    }

    @RequestMapping(value = "/{groupId}/new_task", method = RequestMethod.POST)
    public ModelAndView newTask(@ModelAttribute("content") String task,
                                @RequestParam("title") String taskTitle,
                                @PathVariable("groupId") long groupId) {
        Long taskId = dbTasks.saveAsNewTask(task, taskTitle);
        // TODO: insert to proper group. DONE !!!
        if (taskId != null) {
            dbTasks.insertTaskToEduPlan(groupId, taskId);
            return new ModelAndView("redirect:/api/tasks/{groupId}/new_task");
        }
        return new ModelAndView("redirect:/api/tasks/{groupId}/new_task");
    }

    @RequestMapping(value = "/{taskId}/delete", method = RequestMethod.POST)
    public void deleteTask(@PathVariable("taskId") long taskId) {
        dbTasks.deleteById(taskId);
    }
}




