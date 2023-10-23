package org.example;

import java.util.ArrayList;
import java.util.List;

public class Mentor {
    private String id;

    private String name;

    private float yearsOfExperience;

    private boolean isActive;

    private List<Curso> coursesToTeach;

    public Mentor(String id, String name, float yearsOfExperience, boolean isActive) {
        this.id = id;
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.isActive = isActive;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(float yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<Curso> getCoursesToTeach() {
        return coursesToTeach;
    }

    public void setCoursesToTeach(List<Curso> coursesToTeach) {
        this.coursesToTeach = coursesToTeach;
    }

}
