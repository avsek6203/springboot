package com.SecurityMap.SpringSecurityMapping.Table;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/")
public class TableController {
	@Autowired
	private FacultyService Service;
	@GetMapping("/student")
	public List<Faculty> getAllStudents() {
		return Service.getAllFaculties();
	}
	
	@PostMapping("/students")
	public Faculty save(@RequestBody Faculty student) {
		return Service.saveFaculty(student);
	}
	
	@PutMapping("/update/{id}")
	public Faculty update(@PathVariable("id") int id, @RequestBody Faculty student) {
		return Service.updateStudent(student, id);
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable int id) {
			this.Service.deleteStudent(id);
		}
}
