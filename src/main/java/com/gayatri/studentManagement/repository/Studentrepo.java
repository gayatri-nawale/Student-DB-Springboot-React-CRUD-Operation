package com.gayatri.studentManagement.repository;

import com.gayatri.studentManagement.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public interface Studentrepo extends JpaRepository<Student,Integer> {


}
