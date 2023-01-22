package com.wolfpack.Exercise.controller;

import com.wolfpack.Exercise.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/")
public class Controller {
    //PARAMETERS
    @Autowired
    private final ExerciseService eService;

    //CONSTRUCTOR
    public Controller(ExerciseService s) {
        this.eService = s;
    }

    //METHODS

}
