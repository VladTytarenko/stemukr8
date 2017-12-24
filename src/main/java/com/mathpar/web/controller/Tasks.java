package com.mathpar.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mathpar.func.Page;
import com.mathpar.web.db.dao.DbTasks;
import com.mathpar.web.entity.MathparNotebook;
import com.mathpar.web.entity.TaskInEduPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /*@ResponseBody
    @RequestMapping(value = "/plan", method = RequestMethod.GET)
    public List<TaskInEduPlan> getPlanForCurrentUser(@PageParam Page page) {
        return dbTasks.getPlanForUser(page.getUserId());
    }*/

    @ResponseBody
    @RequestMapping(value = "/{taskId}", method = RequestMethod.GET)
    public MathparNotebook getAllSubtasks(@PathVariable("taskId") long taskId) throws IOException {
        return dbTasks.getTasks(taskId);
    }

    @RequestMapping(value = "/{groupId}/new_task", method = RequestMethod.POST)
    public void newTask(@RequestBody MathparNotebook mathparNotebook,
                        @RequestParam("task_title") String taskName,
                        @PathVariable("groupId") long groupId)
            throws JsonProcessingException {
        Long taskId = dbTasks.saveAsNewTask(mathparNotebook, taskName);
        // TODO: insert to proper group. DONE !!!
        if (taskId != null) { // If this is a new task.
            dbTasks.insertTaskToEduPlan(groupId, taskId);
        }
    }

    @RequestMapping(value = "/{taskId}/delete", method = RequestMethod.POST)
    public void deleteTask(@PathVariable("taskId") long taskId) {
        dbTasks.deleteById(taskId);
    }
}





/*package com.mathpar.web.controller;

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


    @RequestMapping(value = "/plan", method = RequestMethod.GET)
    public List<TaskInEduPlan> getPlanForCurrentUser(@PageParam Page page) {
        return dbTasks.getPlanForUser(page.getUserId());
    }

    @RequestMapping(value = "/{taskId}", method = RequestMethod.GET)
    public MathparNotebook getAllSubtasks(@PathVariable("taskId") long taskId) throws IOException {
        return dbTasks.getTasks(taskId);
    }

    @RequestMapping(value = "/{groupId}/new_task", method = RequestMethod.GET)
    public ModelAndView newTask() {
        return new ModelAndView("new-tasks");
    }

    /*@RequestMapping(value = "/{groupId}/new_task", method = RequestMethod.POST)
    public ModelAndView newTask(@RequestBody MathparNotebook mathparNotebook,
                                @RequestParam("task_title") String taskName,
                                @PathVariable("groupId") long groupId)
            throws JsonProcessingException {
        Long taskId = dbTasks.saveAsNewTask(mathparNotebook, taskName);
        // TODO: insert to proper group.
        // TODO is done

        if (taskId != null) { // If this is a new task.
            dbTasks.insertTaskToEduPlan(groupId, taskId);
        }

        return new ModelAndView("redirect:/" + groupId +"/tasks");
    }

    @RequestMapping(value = "/{groupId}/new_task", method = RequestMethod.POST)
    public ModelAndView newTask(@ModelAttribute("notebook") MathparNotebook mathparNotebook) {
        try {
            Long taskId = dbTasks.saveAsNewTask(mathparNotebook, "taskName1");
            dbTasks.insertTaskToEduPlan(1, taskId);
            System.out.println("OK");
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }

        return new ModelAndView("groups");
    }

    @RequestMapping(value = "/{taskId}/delete", method = RequestMethod.GET)
    public ModelAndView deleteTask() {
        return new ModelAndView("delete_task");
    }

    @RequestMapping(value = "/{taskId}/delete", method = RequestMethod.POST)
    public ModelAndView deleteTask(@PathVariable("taskId") long taskId) {
        dbTasks.deleteById(taskId);
        return new ModelAndView("redirect:/{groupId}/tasks");
    }
}*/
