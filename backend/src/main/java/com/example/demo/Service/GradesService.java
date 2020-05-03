package com.example.demo.Service;

import com.example.demo.Configs.GlobalVariables;
import com.example.demo.Models.Grades;
import com.example.demo.Repositories.GradesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradesService {
    @Autowired
    private GradesRepository gradesRepository;

    // Gets grades according to particular term and year
    public List<Grades> getParticularGrades(Integer userId, String year, Integer term) {
        return gradesRepository.findByUserIdAndYearAndTerm(userId, year, term);
    }

    // Gets grades according to current term and year
    public List<Grades> getGrades(Integer userId) {
        GlobalVariables globalVariables = new GlobalVariables();
        String year = globalVariables.getYear();
        Integer term = globalVariables.getTerm();
        return gradesRepository.findByUserIdAndYearAndTerm(userId, year, term);
    }

    // Gets transcript
    public List<Grades> getTranscript(Integer userId) {
        return gradesRepository.findAllGradesByUserId(userId);
    }
}
