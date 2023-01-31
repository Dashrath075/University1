package com.UniversityCourseSelection.services;

import java.util.List;
import java.util.Optional;

import org.springframework.validation.annotation.Validated;

import com.UniversityCourseSelection.entities.University;
import com.UniversityCourseSelection.exceptions.DuplicateUniversity;
import com.UniversityCourseSelection.exceptions.UniversityIdNotExist;
import jakarta.validation.constraints.Min;

public interface UniversityService {

	List<University> getAllUniversities();

	Optional<University> getUniversityByCode(Long id) throws UniversityIdNotExist;

	void deleteUniversity(Long id) throws UniversityIdNotExist;

	University updateUniversity(University crs) throws UniversityIdNotExist;
}
