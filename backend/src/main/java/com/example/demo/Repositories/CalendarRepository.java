package com.example.demo.Repositories;

import com.example.demo.Models.CalendarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CalendarRepository extends JpaRepository<CalendarEntity, Integer> {
    List<CalendarEntity> findAllByYearAndTerm(String year, Integer term);
}
