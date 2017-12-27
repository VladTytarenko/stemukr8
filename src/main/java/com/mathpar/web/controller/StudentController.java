package com.mathpar.web.controller;

import com.mathpar.web.db.dao.DbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private DbUser dbUser;

    @RequestMapping(value = "/{studentId}", method = RequestMethod.GET)
    public ModelAndView getStudentCabinet(@PathVariable("studentId") long studentId) {
        Map<String, Object> model = new HashMap<>();
        model.put("student", dbUser.getUserById(studentId));
        return new ModelAndView("student-cabinet", model);
    }


}
