package com.wolfpack.Exercise.service;

import com.wolfpack.Exercise.repo.ExerciseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciseService {
    //PARAMETERS
    private final ExerciseRepo exerciseRepo;

    //CONSTRUCTOR
    @Autowired
    public ExerciseService(ExerciseRepo exerciseRepo) {
        this.exerciseRepo = exerciseRepo;
    }

    //METHODS
}
