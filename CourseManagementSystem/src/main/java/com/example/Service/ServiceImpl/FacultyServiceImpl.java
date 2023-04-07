package com.example.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Entity.Faculty;
import com.example.Repository.FacultyRepository;
import com.example.Service.FacultyService;

@Repository
public class FacultyServiceImpl implements FacultyService{
	@Autowired
	FacultyRepository facultyRepository;

	@Override
	public Faculty addFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		return facultyRepository.save(faculty);
	}

	@Override
	public List<Faculty> getAllFaculty() {
		// TODO Auto-generated method stub
		return facultyRepository.findAll();
	}

	@Override
	public void deleteFacultyById(int fid) {
		// TODO Auto-generated method stub
		facultyRepository.deleteById(fid);
	}

	@Override
	public Faculty updateFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		Faculty _faculty=facultyRepository.findFacultyByfid(faculty.getFid());
		_faculty.setFid(faculty.getFid());
		_faculty.setFname(faculty.getFname());
		facultyRepository.save(_faculty);
		return _faculty;
	}

	@Override
	public Faculty findFacultyById(int fid) {
		// TODO Auto-generated method stub
		return facultyRepository.findFacultyByfid(fid);
	}

	@Override
	public Faculty findFacultyByName(String fname) {
		// TODO Auto-generated method stub
		return facultyRepository.findFacultyByfname(fname);
	}
	

}
