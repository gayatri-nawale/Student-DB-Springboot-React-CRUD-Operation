package com.gayatri.studentManagement.controllerss;

import com.gayatri.studentManagement.models.Student;
import com.gayatri.studentManagement.services.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
@RestController
public class StudentController {


    @Autowired
    private Studentservice service;

    @GetMapping
    public String testing(){
        return "Hey Gayatri";
    }

    //create
    @PostMapping("/student")
    public String addStudent(@RequestBody Student s){
        service.addstudent(s);
        return "Student Added";
    }

    //display
    @GetMapping("/students")
    public List<Student> getallstudent(){
        return service.allstudents();
    }

    //find by id
    @GetMapping("/student/{rn}")
    public Student findstudent(@PathVariable int rn){
        return service.findstudent(rn);


    }

    //update
    @PutMapping("/student")
    public String updatestudent(@RequestBody Student s){
        service.updatestudent(s);
        return "Student updated";
    }

    //delete
    @DeleteMapping("/student/{rn}")
    public String delstudent(@PathVariable int rn){
        service.delstudent(rn);
        return "student deleted successfully";
    }

    @GetMapping("load")
    public String loadData(){
        service.loadData();
        return "Data loaded";
    }
}
