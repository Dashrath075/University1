package com.UniversityCourseSelection.services;

import java.util.List;
import java.util.Optional;

import com.UniversityCourseSelection.entities.Student;
import com.UniversityCourseSelection.entities.StudentFeedBack;
import com.UniversityCourseSelection.exceptions.StudentAlreadyExists;
import com.UniversityCourseSelection.exceptions.StudentIdNotExist;

public interface StudentService {
    
	Student saveStudent(Student s) throws StudentAlreadyExists;

	Optional<Student> getStudentById(Long id) throws StudentIdNotExist;


	Student updateStudent(Student crs) throws StudentIdNotExist;

	void deleteStudent(Long id) throws StudentIdNotExist;

	StudentFeedBack postFeedBack(StudentFeedBack s);

	//Optional<Student> studentByName(String studentFirstName);

}
