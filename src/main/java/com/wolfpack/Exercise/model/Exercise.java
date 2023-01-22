package com.wolfpack.Exercise.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Exercise {
    //PARAMETERS
    @Id
    private String name;
    @Column
    private List<String> muscles;
    @Column
    private String tutorial;

    //CONSTRUCTORS
    public Exercise() {}

    public Exercise(String name, List<String> muscles, String tutorial) {
        this.name = name;
        this.muscles = muscles;
        this.tutorial = tutorial;
    }
    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMuscles() {
        return muscles;
    }

    public void setMuscles(List<String> muscles) {
        this.muscles = muscles;
    }

    public String getTutorial() {
        return tutorial;
    }

    public void setTutorial(String tutorial) {
        this.tutorial = tutorial;
    }

}
