package com.example.demo.Controllers;

import com.example.demo.Configs.AddUserSubjectsRequest;
import com.example.demo.Models.UserSubjects;
import com.example.demo.Service.MyUserDetails;
import com.example.demo.Service.UserSubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseRegistrationController {
    @Autowired
    private UserSubjectsService userSubjectsService;

    // Post request for adding subjects to userSubject table
    @RequestMapping(value = "/student/courses/registration", method = RequestMethod.POST)
    public UserSubjects addUserSubjects(@AuthenticationPrincipal MyUserDetails myUserDetails,
                                        @RequestBody AddUserSubjectsRequest request) {
        return userSubjectsService.saveUserSubjects(request.getSubjectId(), myUserDetails.getId());
    }

    // Get all subjects of user
    @RequestMapping(value = "/student/courses/show", method = RequestMethod.GET)
    public List<UserSubjects> getAllSubjectsOfUser(@AuthenticationPrincipal MyUserDetails myUserDetails) {
        return userSubjectsService.getAllSubjects(myUserDetails.getId());
    }
}
