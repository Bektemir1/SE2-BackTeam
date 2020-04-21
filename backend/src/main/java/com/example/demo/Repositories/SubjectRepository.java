package com.example.demo.Repositories;

import com.example.demo.Models.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subjects, Integer> {

}
