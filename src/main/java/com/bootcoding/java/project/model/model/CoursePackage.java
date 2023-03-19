package com.bootcoding.java.project.model.model;

import com.bootcoding.java.project.model.model.CourseCategory;

import java.util.List;

public class CoursePackage {
    private int id;
    private String courseDetails;
    List<CourseCategory> courseCategories;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseDetails() {
        return courseDetails;
    }

    public void setCourseDetails(String courseDetails) {
        this.courseDetails = courseDetails;
    }

    public List<CourseCategory> getCourseCategories() {
        return courseCategories;
    }

    public void setCourseCategories(List<CourseCategory> courseCategories) {
        this.courseCategories = courseCategories;
    }
}
