package com.example.demo.Service;

import com.example.demo.Models.UserSubjects;
import com.example.demo.Repositories.SubjectsRepository;
import com.example.demo.Repositories.UserSubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSubjectsService {
    @Autowired
    UserSubjectsRepository userSubjectsRepository;

    @Autowired
    SubjectsRepository subjectsRepository;

    // Save subjects in UserSubjects repository
    public UserSubjects saveUserSubjects(Integer subjectId, Integer userId) {
        final UserSubjects userSubjects = new UserSubjects();
        userSubjects.setSubjects(subjectsRepository.getOne(subjectId));
        userSubjects.setUserId(userId);
        return userSubjectsRepository.save(userSubjects);
    }

    // Get all subjects that have current user
    public List<UserSubjects> getAllSubjects(Integer userId) {
        return userSubjectsRepository.findAllSubjectsByUserId(userId);
    }
}
