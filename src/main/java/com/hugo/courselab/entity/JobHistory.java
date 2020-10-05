package com.hugo.courselab.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "jobhistory", schema = "public")
public class JobHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jobhistoryid")
    private Integer id;

    @Column(name = "startdate")
    private Date startDate;

    @Column(name = "enddate")
    private Date endDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="jobid")
    private Job jobId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="departmentid")
    private Department departmentId;

    public JobHistory() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Job getJobId() {
        return jobId;
    }

    public void setJobId(Job jobId) {
        this.jobId = jobId;
    }

    public Department getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Department departmentId) {
        this.departmentId = departmentId;
    }
}