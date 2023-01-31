package com.UniversityCourseSelection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UniversityCourseSelection.entities.StudentFeedBack;

public interface StudentFeedBackRepository extends JpaRepository<StudentFeedBack, Long> {

}
