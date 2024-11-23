package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {


    @NotBlank
    @Size(min = 3, max = 150)
    private String description;

    public Skill() {

    }


    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    @ManyToMany(mappedBy="skills")
    private List<Job> jobs = new ArrayList<>();

    public @NotBlank @Size(min = 3, max = 150) String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank @Size(min = 3, max = 150) String description) {
        this.description = description;
    }



}
