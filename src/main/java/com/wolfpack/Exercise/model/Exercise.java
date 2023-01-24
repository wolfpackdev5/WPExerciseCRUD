package com.wolfpack.Exercise.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "exercises")
public class Exercise {
    //PARAMETERS
    @Id
    @Column
    private String name;
    @Column
    private String muscles;
    @Column
    private String tutorial;

    //CONSTRUCTORS
    public Exercise() {}

   public Exercise(String name, String muscles, String tutorial) {
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

    public String getMuscles() {
        return muscles;
    }

    public void setMuscles(String muscles) {
        this.muscles = muscles;
    }

    public String getTutorial() {
        return tutorial;
    }

    public void setTutorial(String tutorial) {
        this.tutorial = tutorial;
    }

}
