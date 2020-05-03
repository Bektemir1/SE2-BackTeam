package com.example.demo.Service;

import com.example.demo.Models.Departments;
import com.example.demo.Repositories.DepartmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentsService {
    @Autowired
    private DepartmentsRepository departmentsRepository;

    // Retrieve all departments from database that corresponds to his faculty
    public List<Departments> getAllByFacultyId(Integer facultyId) {
        return departmentsRepository.findAllDepartmentsByFacultyId(facultyId);
    }
}
