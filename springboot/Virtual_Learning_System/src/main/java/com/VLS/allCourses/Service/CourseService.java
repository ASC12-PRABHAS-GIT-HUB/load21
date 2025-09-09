package com.VLS.allCourses.Service;

import com.VLS.allCourses.entity.CoursesEntity;
import java.util.List;

public interface CourseService {

    List<CoursesEntity> getAllCourses();

    CoursesEntity getCourseById(Long id);

    CoursesEntity createCourse(CoursesEntity course);

    CoursesEntity updateCourse(Long id, CoursesEntity course);

    void deleteCourse(Long id);
}