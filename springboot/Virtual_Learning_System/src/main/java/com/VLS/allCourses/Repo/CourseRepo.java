package com.VLS.allCourses.Repo;

import com.VLS.allCourses.entity.CoursesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<CoursesEntity,Long> {
}
