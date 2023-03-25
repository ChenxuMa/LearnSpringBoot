package com.clark.learnspring.buildrestapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {
    private Integer course_id;
    private String course_name;
    private String course_admin;
}
