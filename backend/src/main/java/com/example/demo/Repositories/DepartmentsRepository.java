package com.example.demo.Repositories;

import com.example.demo.Models.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentsRepository extends JpaRepository<Departments, Integer> {
    List<Departments> findAllDepartmentsByFacultyId(Integer facultyId);
}
