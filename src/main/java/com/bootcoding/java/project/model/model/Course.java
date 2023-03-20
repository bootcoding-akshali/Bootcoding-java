package com.bootcoding.java.project.model.model;

import java.util.List;

public class Course {
    private int id;
    private String courseName;
    List<CourseTopic> courseTopics;
    List<CoursePackage> coursePackages;

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<CourseTopic> getCourseTopics() {

        return courseTopics;
    }

       public void setCourseTopics(List<CourseTopic> courseTopics) {

        this.courseTopics = courseTopics;
    }

    public List<CoursePackage> getCoursePackages() {

        return coursePackages;
    }

    public void setCoursePackages(List<CoursePackage> coursePackages) {

        this.coursePackages = coursePackages;
    }
}
