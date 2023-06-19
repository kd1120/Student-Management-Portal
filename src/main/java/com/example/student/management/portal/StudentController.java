package com.example.student.management.portal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
            StudentService studentService;



    @GetMapping("/get_info")
    public ResponseEntity getStudent(@RequestParam("id") int admnNo){
        Student s = studentService.getStudent(admnNo);
        if(s==null){
            return new ResponseEntity("Student not found",HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(s,HttpStatus.ACCEPTED);
    }
    @PostMapping("/add")
    public ResponseEntity addStudent(@RequestBody Student student){
        String s = studentService.addStudent(student);
        return new ResponseEntity(s, HttpStatus.CREATED);
    }

//    @GetMapping("/get_info")
//    public Student getStudent(@RequestParam("id") int admNo){
//        return studentDb.get(admNo);
//
//    }
//
//    @PostMapping("/add")
//    public String addStudent( @RequestBody Student student){
//        studentDb.put(student.getAdmNO(),student);
//        return "Student added successfully";
//
//    }

//    @GetMapping("/get/{id}")
//    public  Student getStudentByPathVariable(@PathVariable("id") int admNO,@PathVariable("message") String message){
//
//        return message + studentDb.get(admNO);
//    }

//    @DeleteMapping("/delete")
//    public String deleteStudent(int admNO){
//        if(studentDb.get(admNO)==null){
//            throw new RuntimeException("Student does not exist");
//
//        }
//        studentDb.remove(admNO);
//        return "Deleted Successfully";
//    }
//
//
//    @PutMapping("/update_course")
//    public Student updateCourse(@RequestParam("id") int admNO,@RequestParam("course") String newCourse) {
//        if(studentDb.get(admNO)==null){
//            throw new RuntimeException("Student does not exist");
//
//        }
//        Student student  = studentDb.get(admNO);
//        student.setCourse(newCourse);
//    return student;
//
//    }
//
//    @GetMapping("/get-total-students")
//    // totol no of student above age 25
//    public int getTotalStudent(){
//        int total =0;
//        for(int admNO:studentDb.keySet()){
//
//            if(studentDb.get(admNO).getAge()>25){
//                total++;
//            }
//        }
//        return total;
//    }

}
