package com.example.demo.Service;

import com.example.demo.Models.Attendance;
import com.example.demo.Repositories.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceService {
    @Autowired
    AttendanceRepository attendanceRepository;

    // Get User attendance
    public List<Attendance> getUserAttendance(String email) {
        return attendanceRepository.findUserAttendanceByEmail(email);
    }
}
