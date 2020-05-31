package com.example.demo.Controllers;

import com.example.demo.Models.TeacherSubjects;
import com.example.demo.Models.Schedule;
import com.example.demo.Service.TeacherSubjectsService;
import com.example.demo.Service.MyUserDetails;
import com.example.demo.Service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    @Autowired
    private TeacherSubjectsService teacherSubjectsService;

    // Post request to get particular term or year of student
    @PreAuthorize("hasRole('ROLE_STUDENT')")
    @RequestMapping(value = "/student/schedule", method = RequestMethod.POST)
    public List<Schedule> getParticularSchedule(@AuthenticationPrincipal MyUserDetails myUserDetails,
                                                @RequestBody Schedule schedule) {
        return scheduleService.getParticularSchedule(myUserDetails.getDepartmentId(), schedule.getYear(), schedule.getTerm());
    }

    // Get student schedule
    @PreAuthorize("hasRole('ROLE_STUDENT')")
    @RequestMapping(value = "/student/schedule", method = RequestMethod.GET)
    public List<Schedule> getSchedule(@AuthenticationPrincipal MyUserDetails myUserDetails) {
        return scheduleService.getSchedule(myUserDetails.getDepartmentId());
    }

    // Get lessons that have teacher
    @PreAuthorize("hasRole('ROLE_TEACHER')")
    @RequestMapping(value = "/teacher/schedule", method = RequestMethod.GET)
    public List<TeacherSubjects> getTeacherSchedule(@AuthenticationPrincipal MyUserDetails myUserDetails) {
        return teacherSubjectsService.getSubjectsOfTeacher(myUserDetails.getId());
    }
}
