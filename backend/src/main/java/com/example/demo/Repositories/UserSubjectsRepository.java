package com.example.demo.Repositories;

import com.example.demo.Models.UserSubjects;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserSubjectsRepository extends JpaRepository<UserSubjects, Integer> {
    List<UserSubjects> findAllSubjectsByUserIdAndYearAndTerm(Integer userId, String year, Integer term);
}
