package com.example.demo.Service;

import com.example.demo.Configs.GlobalVariables;
import com.example.demo.Models.UserSubjects;
import com.example.demo.Repositories.SubjectsRepository;
import com.example.demo.Repositories.UserSubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSubjectsService {
    @Autowired
    private UserSubjectsRepository userSubjectsRepository;

    @Autowired
    private SubjectsRepository subjectsRepository;

    // Save subjects in UserSubjects repository
    public UserSubjects saveUserSubjects(Integer subjectId, Integer userId) {
        GlobalVariables globalVariables = new GlobalVariables(); // Gets current year and term
        String year = globalVariables.getYear();
        Integer term = globalVariables.getTerm();

        final UserSubjects userSubjects = new UserSubjects();
        userSubjects.setSubjects(subjectsRepository.getOne(subjectId));
        userSubjects.setUserId(userId);
        userSubjects.setYear(year);
        userSubjects.setTerm(term);
        return userSubjectsRepository.save(userSubjects);
    }

    // Get all subjects that have current user
    public List<UserSubjects> getAllSubjects(Integer userId) {
        GlobalVariables globalVariables = new GlobalVariables(); // Gets current year and term
        String year = globalVariables.getYear();
        Integer term = globalVariables.getTerm();

        return userSubjectsRepository.findAllSubjectsByUserIdAndYearAndTerm(userId, year, term);
    }
}
