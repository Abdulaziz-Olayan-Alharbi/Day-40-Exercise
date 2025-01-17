package com.example.day_39_exercise.Repository;

import com.example.day_39_exercise.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    Course findCourseById(Integer id);
}
