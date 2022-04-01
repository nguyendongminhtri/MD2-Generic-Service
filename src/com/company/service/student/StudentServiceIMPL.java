package com.company.service.student;

import com.company.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceIMPL implements IStudentService {
    public static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1, "Kiên"));
        studentList.add(new Student(2, "Anh Tây"));
    }
    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void save(Student student) {
        studentList.add(student);
    }

    @Override
    public void deleteById(int id) {
        studentList.remove(id);
    }
}
