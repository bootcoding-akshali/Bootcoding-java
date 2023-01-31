package com.bootcoding.java.project.model.service;

import com.bootcoding.java.project.model.dao.StudentDAO;
import com.bootcoding.java.project.model.model.Student;
import com.bootcoding.java.project.model.model.StudentAddress;
import com.bootcoding.java.project.model.utils.EmailId;
import com.bootcoding.java.project.model.utils.NameGenerator;

public class StudentService {
    private StudentDAO StudentDAO;

    public StudentService() {
        StudentDAO = new StudentDAO();
    }

    public void createRandomStudents() {
        Student student = new Student();
        for (int i = 0; i <= 100; i++) {
            student.setName(NameGenerator.getName());
            student.setEmail_id(EmailId.EmailIdGenerator.getEmailId(student.getName()));
            student.setId(i);

            StudentDAO.insertStudentData(student);
        }
    }
}



