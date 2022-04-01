package com.company;

import com.company.model.Student;
import com.company.service.language.LanguageServiceIMPL;
import com.company.service.student.StudentServiceIMPL;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LanguageServiceIMPL languageServiceIMPL = new LanguageServiceIMPL();
        StudentServiceIMPL studentServiceIMPL = new StudentServiceIMPL();
        System.out.println(languageServiceIMPL.findAll());
        Student student = new Student(3, "Vô Biên");
        studentServiceIMPL.save(student);
        System.out.println("List Student sau khi thêm ---> "+studentServiceIMPL.findAll());
        studentServiceIMPL.deleteById(2);
        System.out.println("List Student sau khi xóa---> "+studentServiceIMPL.findAll());
    }
}
