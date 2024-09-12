package com.SecurityMap.SpringSecurityMapping.Table;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepo;

    public List<Faculty> getAllFaculties() {
        return facultyRepo.findAll();
    }

    public Faculty saveFaculty(Faculty faculty) {
        return facultyRepo.save(faculty);
    }
    public Faculty updateStudent(Faculty student, long id) {
		student.setId(id); 
		facultyRepo.save(student); 
//	    student.setPassword(bCryptPasswordEncoder.encode(student.getPassword()));
	    return student;
	}

	public void deleteStudent(long id) {
		facultyRepo.deleteById(id);
	}
	

    // Other CRUD methods
}