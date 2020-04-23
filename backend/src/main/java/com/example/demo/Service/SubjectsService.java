package com.example.demo.Service;

import com.example.demo.Models.Subjects;
import com.example.demo.Repositories.SubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectsService {
    @Autowired
    SubjectsRepository subjectsRepository;

    // Get all subjects that corresponds to user department
    public List<Subjects> getAllByDepartmentId(Integer departmentId) {
        return subjectsRepository.findAllSubjectsByDepartmentsId(departmentId);
    }
}
