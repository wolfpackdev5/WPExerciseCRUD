package com.wolfpack.Exercise.repo;

import com.wolfpack.Exercise.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExerciseRepo extends JpaRepository<Exercise, String> {
    public List<Exercise> findAll();
}
