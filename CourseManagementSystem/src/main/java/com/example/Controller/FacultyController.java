package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Faculty;
import com.example.Service.FacultyService;

@RestController
public class FacultyController {
	@Autowired
	
	FacultyService facultyService;
	@PostMapping (value="/faculty")
	public Faculty addFaculty(@RequestBody Faculty faculty)
	{
		return facultyService.addFaculty(faculty);
			
	}
	@GetMapping (value="/faculty")
	public List<Faculty> getAllfaculty()
	{
		return facultyService.getAllFaculty();
		
	}
	
	@DeleteMapping (value ="/faculty/{fid}")
	public String deleteFaculty(@PathVariable int fid)
	{
		facultyService.deleteFacultyById(fid);
		return "faculty is deleted";
	}
	
	@PutMapping(value ="/faculty")
	public  Faculty updateFaculty(@RequestBody Faculty faculty )
	{
		return facultyService.updateFaculty(faculty);
		
	}
	
	@GetMapping(value ="/faculty/{fid}")
	public Faculty findFacultyById(@PathVariable int fid)
	{
	return facultyService.findFacultyById(fid);
	}
	
	@GetMapping(value ="/faculty/{fname}")
	public Faculty findFacultyByName(@PathVariable String fname)
	{
		return facultyService.findFacultyByName(fname);
		
	}
		
		

}
