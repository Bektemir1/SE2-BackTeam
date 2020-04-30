package com.example.demo.Repositories;

import com.example.demo.Models.Grades;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GradesRepository extends JpaRepository<Grades, Integer> {
    List<Grades> findByUserIdAndYearAndTerm(Integer userId, String year, Integer term);
    List<Grades> findAllGradesByUserId(Integer userId);
}
