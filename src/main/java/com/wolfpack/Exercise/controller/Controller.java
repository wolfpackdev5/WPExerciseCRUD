package com.wolfpack.Exercise.controller;

import com.wolfpack.Exercise.model.Exercise;
import com.wolfpack.Exercise.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/")
public class Controller {
    //PARAMETERS
    @Autowired
    private final ExerciseService exerciseService;

    //CONSTRUCTOR
    public Controller(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    //METHODS
    @GetMapping("all")
    public ResponseEntity<List<Exercise>> allExercises() {
        List exercises = this.exerciseService.getAllExercises();
        return new ResponseEntity<>(exercises, HttpStatus.OK);
    }
}
