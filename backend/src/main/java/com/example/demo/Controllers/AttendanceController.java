package com.example.demo.Controllers;

import com.example.demo.Models.Attendance;
import com.example.demo.Service.AttendanceService;
import com.example.demo.Service.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AttendanceController {
    @Autowired
    AttendanceService attendanceService;

    // Get User Attendance
    @RequestMapping(value = "/attendance", method = RequestMethod.GET)
    public List<Attendance> getUserAttendance(@AuthenticationPrincipal MyUserDetails myUserDetails) {
        return attendanceService.getUserAttendance(myUserDetails.getEmail());
    }
}
