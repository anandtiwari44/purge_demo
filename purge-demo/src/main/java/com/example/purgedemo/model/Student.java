package com.example.purgedemo.model;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
    private int id;
    private String studentName;
    private Date createTimestamp;

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public Student(int id, String studentName, Date createTimestamp) {
        this.id = id;
        this.studentName = studentName;
        this.createTimestamp = createTimestamp;
    }

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }
}
