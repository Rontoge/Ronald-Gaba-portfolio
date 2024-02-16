package com.xadmin.SpringBootCrud.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCrud.bean.Subject;
import com.xadmin.SpringBootCrud.service.SubjectService;

@RestController
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping("/subject")
	public List<Subject> getAllSubjects(){
		
		return subjectService.getAllSubjects();
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/subject")
	public void addSubject(@RequestBody  Subject subject) {
		subjectService.addSubject(subject);
	}

	@RequestMapping(method = RequestMethod.PUT , value ="/subject/{BookId}")
	public void updateSubject(@PathVariable String BookId,@RequestBody  Subject subject) {
		subjectService.updateSubject(subject);
	}

	@RequestMapping(method = RequestMethod.DELETE , value ="/subject/{BookId}")
	public void DeleteSubject(@PathVariable String BookId) {
		
		subjectService.deleteSubject(BookId);
	}
		
}
