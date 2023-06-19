//package com.example.student.management.portal;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class StudentService {
//
//    @Autowired
//    StudetnRepository studetnRepository;
//    public Student getStudent(int admNO){
//
//        return studetnRepository.getStudent(admNO);
//
//    }
//}
package com.example.student.management.portal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student getStudent(int admnNo){
        return studentRepository.getStudent(admnNo);
    }

    public String addStudent(Student student) {

        return studentRepository.addStudent(student);
    }

    public String getStudentByPathVariable(int admnNo, String message) {

        Student s = studentRepository.getStudentByPathVariable(admnNo);
        return s + message;
    }
}