package com.example.demo.Controllers;

import com.example.demo.Models.Departments;
import com.example.demo.Models.Subjects;
import com.example.demo.Service.DepartmentsService;
import com.example.demo.Service.MyUserDetails;
import com.example.demo.Service.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CurriculaController {
    @Autowired
    private DepartmentsService departmentsService;

    @Autowired
    private SubjectsService subjectsService;

    // Get all departments that corresponds to user faculty
    @RequestMapping(value = "/student/curricula/departments", method = RequestMethod.GET)
    public List<Departments> getAllDepartmentsOfUser(@AuthenticationPrincipal MyUserDetails myUserDetails) {
        return departmentsService.getAllByFacultyId(myUserDetails.getFacultyId());
    }

    // Get all subjects that corresponds to user department
    @RequestMapping(value = "/student/curricula/departments/subjects", method = RequestMethod.GET)
    public List<Subjects> getAllSubjectsOfUser(@AuthenticationPrincipal MyUserDetails myUserDetails) {
        return subjectsService.getAllByDepartmentId(myUserDetails.getDepartmentId());
    }

    // My Curriculum Controller
    @RequestMapping(value ="/student/curricula/myCurriculum", method = RequestMethod.GET)
    public List<Subjects> getMyCurriculum(@AuthenticationPrincipal MyUserDetails myUserDetails) {
        return subjectsService.getAllByDepartmentId(myUserDetails.getDepartmentId());
    }
}
