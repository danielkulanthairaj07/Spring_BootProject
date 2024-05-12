package com.tnsif.PlacementManagement.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.PlacementManagement.entity.Student;
import com.tnsif.PlacementManagement.repository.StudentRepository;

@RestController
public class StudentController {
	@Autowired
	StudentRepository repo;

	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {

		return repo.save(student);
	}

	@GetMapping("/student")
	public List<Student> getStudents() {
		return repo.findAll();

	}
    @GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable Integer id) {
		return repo.findById(id).get();

	}
    @DeleteMapping("/student/{id}")
    public void deleteStudent (@PathVariable Integer id) {
    	repo.deleteById(id);
    }
    @PutMapping("/student/{id}")
    public Student updateStudent(@PathVariable Long id,@RequestBody Student student) {
       student.setId(id);
    	 return repo.save(student);
    }
}

