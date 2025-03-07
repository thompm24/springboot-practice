package com.example.demo.student;
import com.example.demo.student.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.time.LocalDate;

@Service
public class StudentService { 
  public List<Student> getStudents() {
    return List.of(
        new Student(1L, "jeffrey", "jeffrey@gmail.com", LocalDate.of(2005, 1, 1), 20),
        new Student(2L, "geoffrey", "geoffrey@gmail.com", LocalDate.of(2002, 1, 1), 23)
        );
  }
}
