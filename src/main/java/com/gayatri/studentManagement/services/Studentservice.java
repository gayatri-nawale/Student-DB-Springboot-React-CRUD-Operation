package com.gayatri.studentManagement.services;

import com.gayatri.studentManagement.models.Student;
import com.gayatri.studentManagement.repository.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Studentservice {
    List<Student> students=new ArrayList<>(Arrays.asList(
            new Student(11,"Gayatri","Computer",3,"Pune",98765432)
    ));
    @Autowired
    private Studentrepo repo;
    public void addstudent(Student s){
        repo.save(s);
    }

    public List<Student> allstudents() {
        return repo.findAll();
    }

    public void updatestudent(Student s) {
         repo.save(s);
    }

    public void delstudent(int rn) {
        repo.deleteById(rn);
    }

    public Student findstudent(int rn) {
        return repo.findById(rn).orElse(new Student());
    }
    public void loadData(){
        repo.saveAll(students);

    }
}
