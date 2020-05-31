package com.example.demo.Repositories;

import com.example.demo.Models.TeacherSubjects;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherSubjectsRepository extends JpaRepository<TeacherSubjects, Integer> {
    List<TeacherSubjects> findAllSubjectsByTeacherIdAndYearAndTerm(Integer teacherId, String year, Integer term);
}
