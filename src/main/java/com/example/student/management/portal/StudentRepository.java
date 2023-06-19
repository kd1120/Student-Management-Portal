package com.example.student.management.portal;
//
//import org.springframework.stereotype.Repository;
//
//import java.util.Map;
//
//@Repository
//public class StudentRepository {
//
//    Map<Integer,Student>    studentDb = new Map<Integer, Student>()
//
//            public Student getStudent(int admNO){
//        return studentDb.(admNO);
//
//            }
//}
//


import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {

    Map<Integer,Student> studentsDb = new HashMap<>(); // db - key - admnNo

    public Student getStudent(int admnNo){
        return studentsDb.get(admnNo);
    }

    public String addStudent(Student student){

        if(studentsDb.containsKey(student.getAdmNO())){
            return "Student already present";
        }

        studentsDb.put(student.getAdmNO(),student);
        return "Student added successfully";
    }

    public Student getStudentByPathVariable(int admnNo) {

        return studentsDb.get(admnNo);
    }
}