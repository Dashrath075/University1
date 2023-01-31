package com.UniversityCourseSelection.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.UniversityCourseSelection.entities.StudentFeedBack;
import com.UniversityCourseSelection.exceptions.NoFeedBacks;
import com.UniversityCourseSelection.services.StudentFeedBackService;

@RestController
public class FeedBackController {
	@Autowired
	private StudentFeedBackService feedService;
	
	@GetMapping("/getStudentFeedBack/{feedBackId}")
	public ResponseEntity<List<StudentFeedBack>> getFeedBackById(@RequestParam Long id) throws NoFeedBacks  {
		Optional<StudentFeedBack> str1 = feedService.getStudentFeedBackById(id);
		return new ResponseEntity(str1, HttpStatus.OK);
	}
	
	@GetMapping("/getAllStudentFeedBacks")
	public ResponseEntity<List<StudentFeedBack>> getAllFeedBacks(){
		List<StudentFeedBack> list = feedService.getAllFeedBacks();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
}
