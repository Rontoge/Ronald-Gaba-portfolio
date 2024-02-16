package com.xadmin.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;
import com.xadmin.SpringBootCrud.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCrud.bean.Subject;


@Service
public class SubjectService {
	
	@Autowired
	public SubjectRepository subjectRepo;
	
	public List<Subject> getAllSubjects(){
		
		
		List<Subject> subjects = new ArrayList<>();
		subjectRepo.findAll().forEach(subjects :: add);
		return subjects;
	}

	public void addSubject(Subject subject) {
		subjectRepo.save(subject);
		
		
	}

	public void updateSubject(Subject subject) {
		subjectRepo.save(subject);
		
	}

	public void deleteSubject(String bookId) {
		subjectRepo.deleteById(bookId);
		
	}

}
