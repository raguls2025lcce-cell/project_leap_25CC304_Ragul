package com.example.project_leap_25cc304_ragul.Controller;

import com.example.project_leap_25cc304_ragul.Model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class WebController {
        @PostMapping("/calc")
        int calculate(int a, int b, String operation) {
            switch (operation) {
                case "+" -> {
                    return a + b;
                }
                case "-" -> {
                    return a - b;
                }

                case "*" -> {
                    return a * b;
                }

                case "/" -> {
                    return a / b;
                }
            }
            return 0;
        }

        @GetMapping("/student")
        public Student getStudentDetails() {
            Student student = new Student();
            student.setName("Ezhumalai");
            student.setDeptartment("CCE");
            student.setRollNo("25CC008");
            return student;
        }
    }

