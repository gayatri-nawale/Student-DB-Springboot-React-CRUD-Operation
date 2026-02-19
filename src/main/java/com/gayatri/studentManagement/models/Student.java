package com.gayatri.studentManagement.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Student {
    @Id
    private int rollno;
    private String name;
    private String department;
    private int year;
    private String city;
    private long phonenumber;

    public Student() {

    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public Student(int rollno, String name, String department, int year, String city, long phonenumber) {
        this.rollno = rollno;
        this.name = name;
        this.department = department;
        this.year = year;
        this.city = city;
        this.phonenumber = phonenumber;
    }
}
