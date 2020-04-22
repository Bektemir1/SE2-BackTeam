package com.example.demo.Service;

import com.example.demo.Models.Attendance;
import com.example.demo.Repositories.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class AttendanceService {
    @Autowired
    AttendanceRepository attendanceRepository;

    // Finds in attendance table by email and gets exact year or term
    public List<Attendance> getUserAttendanceByYearAndTerm(String email, String year, Integer term) {
        return attendanceRepository.findByEmailAndYearAndTerm(email, year, term);
    }

    // Finds in attendance table by email of the current user
    public List<Attendance> getUserAttendanceByEmailCurrentDate(String email) {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        int temp_year = cal.get(Calendar.YEAR);
        int term = cal.get(Calendar.MONTH);

        if (term >= 1 && term <= 5)
            term = 2;
        else if (term >= 9 && term <= 12)
            term = 1;

        String year = null;
        if (term == 1)
            year = temp_year + "-" + temp_year + 1;
        else if (term == 2)
            year = temp_year - 1 + "-" + temp_year;

        return attendanceRepository.findByEmailAndYearAndTerm(email, year, term);
    }
}
