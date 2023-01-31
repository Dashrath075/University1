package com.UniversityCourseSelection.services;

import java.util.List;
import java.util.Optional;

import com.UniversityCourseSelection.entities.StudentFeedBack;
import com.UniversityCourseSelection.exceptions.NoFeedBacks;

public interface StudentFeedBackService {

	Optional<StudentFeedBack> getStudentFeedBackById(Long id) throws NoFeedBacks;

	List<StudentFeedBack> getAllFeedBacks();

}
