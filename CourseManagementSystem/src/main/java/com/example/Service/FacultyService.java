package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entity.Faculty;

@Service
public interface FacultyService {
	public Faculty addFaculty (Faculty faculty);
	public List <Faculty> getAllFaculty();
	public void deleteFacultyById(int fid);
	public Faculty updateFaculty(Faculty faculty);
	public Faculty findFacultyById(int fid);
	public Faculty findFacultyByName(String fname);
}
