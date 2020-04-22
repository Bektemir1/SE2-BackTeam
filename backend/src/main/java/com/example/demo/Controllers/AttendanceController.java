package com.example.demo.Controllers;

import com.example.demo.Models.Attendance;
import com.example.demo.Service.AttendanceService;
import com.example.demo.Service.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AttendanceController {
    @Autowired
    AttendanceService attendanceService;

    // Post request to get exact term or year of User Attendance
    @RequestMapping(value = "/attendance", method = RequestMethod.POST)
    public List<Attendance> getUserAttendanceOfExactYear(@AuthenticationPrincipal MyUserDetails myUserDetails,
                                                         @RequestBody Attendance attendance) {
        return attendanceService.getUserAttendanceByYearAndTerm(myUserDetails.getEmail(), attendance.getYear(), attendance.getTerm());
    }

    // Get current date User Attendance
    @RequestMapping(value = "/attendance", method = RequestMethod.GET)
    public List<Attendance> getUserAttendance(@AuthenticationPrincipal MyUserDetails myUserDetails) {
        return attendanceService.getUserAttendanceByEmailCurrentDate(myUserDetails.getEmail());
    }
}
