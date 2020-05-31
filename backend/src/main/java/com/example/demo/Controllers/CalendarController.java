package com.example.demo.Controllers;

import com.example.demo.Models.CalendarEntity;
import com.example.demo.Service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CalendarController {
    @Autowired
    private CalendarService calendarService;

    // Post request to get particular year and term calendar
    @RequestMapping(value = "/student/calendar", method = RequestMethod.POST)
    public List<CalendarEntity> getParticularCalendar(@RequestBody CalendarEntity calendarEntity) {
        return calendarService.getParticularCalendar(calendarEntity.getYear(), calendarEntity.getTerm());
    }

    // Gets current year and term calendar
    @RequestMapping(value = "/student/calendar", method = RequestMethod.GET)
    public List<CalendarEntity> getCurrentCalendar() {
        return calendarService.getCurrentCalendar();
    }
}
