package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
public class Job extends AbstractEntity {

//    @Id
//    @GeneratedValue
//    private int id;

//    private String name;
    @ManyToMany
    @NotNull(message = "Cannot be blank")
    @Size(min = 1, message = "Select 1 skill")
    private List<Skill> skills;

    @ManyToOne
    private Employer employer;

//    private String skills;


    public Job() {
    }

    // Initialize the id and value fields.
    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.
    
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

}
