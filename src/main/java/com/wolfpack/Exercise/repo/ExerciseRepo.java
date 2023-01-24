package com.wolfpack.Exercise.repo;

import com.wolfpack.Exercise.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExerciseRepo extends JpaRepository<Exercise, String> {
   @Query(value = "SELECT * from Exercise e WHERE e.muscles LIKE %?1%", nativeQuery = true)
    public List<Exercise> findAllByMuscles(String muscles);
}
