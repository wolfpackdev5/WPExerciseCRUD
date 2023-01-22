package com.wolfpack.Exercise.repo;

import com.wolfpack.Exercise.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepo extends JpaRepository<Exercise, String> {
}
