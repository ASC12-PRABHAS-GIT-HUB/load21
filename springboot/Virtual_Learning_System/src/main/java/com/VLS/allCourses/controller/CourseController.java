package com.VLS.allCourses.controller;



import com.VLS.allCourses.entity.CoursesEntity;
import com.VLS.allCourses.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }


    @GetMapping
    public ResponseEntity<List<CoursesEntity>> getAllCourses() {
        return ResponseEntity.ok(courseService.getAllCourses());
    }


    @GetMapping("/{id}")
    public ResponseEntity<CoursesEntity> getCourseById(@PathVariable Long id) {
        return ResponseEntity.ok(courseService.getCourseById(id));
    }


    @PostMapping
    public ResponseEntity<CoursesEntity> createCourse(@RequestBody CoursesEntity course) {
        return ResponseEntity.ok(courseService.createCourse(course));
    }


    @PutMapping("/{id}")
    public ResponseEntity<CoursesEntity> updateCourse(@PathVariable Long id, @RequestBody CoursesEntity course) {
        return ResponseEntity.ok(courseService.updateCourse(id, course));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return ResponseEntity.noContent().build();
    }
}
