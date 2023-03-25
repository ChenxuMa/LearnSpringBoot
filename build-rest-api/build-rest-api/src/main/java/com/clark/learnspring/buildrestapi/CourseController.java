package com.clark.learnspring.buildrestapi;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> courseinfo(){
        return Arrays.asList(
            new Course(1, "Maths", "Clark"),
            new Course(2, "Physics", "Clark"),
            new Course(3, "Biology", "Clark")
        );
    }
}
