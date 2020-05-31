package com.example.demo.Service;

import com.example.demo.Configs.GlobalVariables;
import com.example.demo.Models.TeacherSubjects;
import com.example.demo.Repositories.TeacherSubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherSubjectsService {
    @Autowired
    private TeacherSubjectsRepository teacherSubjectsRepository;

    // Get lessons of teacher of current term and year
    public List<TeacherSubjects> getSubjectsOfTeacher(Integer teacherId) {
        GlobalVariables globalVariables = new GlobalVariables(); // Gets current year and term
        String year = globalVariables.getYear();
        Integer term = globalVariables.getTerm();

        return teacherSubjectsRepository.findAllSubjectsByTeacherIdAndYearAndTerm(teacherId, year, term);
    }
}
