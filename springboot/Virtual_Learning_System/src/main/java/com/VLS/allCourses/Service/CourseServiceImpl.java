package com.VLS.allCourses.Service;



import com.VLS.allCourses.entity.CoursesEntity;
import com.VLS.allCourses.Repo.CourseRepo;
import com.VLS.allCourses.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepo courseRepo;

    @Autowired
    public CourseServiceImpl(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    @Override
    public List<CoursesEntity> getAllCourses() {
        return courseRepo.findAll();
    }

    @Override
    public CoursesEntity getCourseById(Long id) {
        return courseRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + id));
    }

    @Override
    public CoursesEntity createCourse(CoursesEntity course) {
        return courseRepo.save(course);
    }

    @Override
    public CoursesEntity updateCourse(Long id, CoursesEntity course) {
        CoursesEntity existingCourse = getCourseById(id);

        existingCourse.setCourseName(course.getCourseName());
        existingCourse.setAuthorName(course.getAuthorName());
        existingCourse.setDuration(course.getDuration());
        existingCourse.setAvailabilty(course.getAvailabilty());

        return courseRepo.save(existingCourse);
    }

    @Override
    public void deleteCourse(Long id) {
        CoursesEntity existingCourse = getCourseById(id);
        courseRepo.delete(existingCourse);
    }
}
