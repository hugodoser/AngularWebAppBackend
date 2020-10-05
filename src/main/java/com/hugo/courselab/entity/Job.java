package com.hugo.courselab.entity;

import javax.persistence.*;

@Entity
@Table(name = "job", schema = "public")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jobid")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "minsalary")
    private int minSalary;

    @Column(name = "maxsalary")
    private int maxSalary;

    public Job() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }
}