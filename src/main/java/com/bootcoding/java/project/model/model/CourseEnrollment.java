package com.bootcoding.java.project.model.model;

import java.util.Date;
import java.util.List;

public class CourseEnrollment {
    private int id;
    private int enrollmentNo;
    private Date enrollmentDate;
    List<Student> students;
    List<CoursePackage> coursePackages;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEnrollmentNo() {
        return enrollmentNo;
    }

    public void setEnrollmentNo(int enrollmentNo) {
        this.enrollmentNo = enrollmentNo;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<CoursePackage> getCoursePackages() {
        return coursePackages;
    }

    public void setCoursePackages(List<CoursePackage> coursePackages) {
        this.coursePackages = coursePackages;
    }
}
