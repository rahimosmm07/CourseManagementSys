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

import com.example.Entity.Course;
import com.example.Service.CourseService;

@RestController
public class CourseController {
	@Autowired
	CourseService courseService;
	
	@PostMapping(value="/course")
	public Course addCourse (@RequestBody Course course) {
		return courseService.addCourse(course);
		
	}
	@GetMapping(value= "/course")
	public List<Course> getAllCource()
	{
		return courseService.getAllCourse();
	}
	
	@DeleteMapping(value ="/course{cid}")
	public String  deleteCourse(@PathVariable int cid)
	{
		courseService.deleteCourseById(cid);
		return "course is deleted";
	}
	
	@PutMapping(value ="/course")
	public Course updateCourse(@RequestBody Course course)
	{
		return courseService.updateCourse(course);
		
	}
	
	@GetMapping(value ="/course/{cid}")
	public Course findCourseById(@PathVariable int cid)
	{
		return courseService.findCourseById(cid);
	}
	
	@GetMapping(value ="/course/{cname}")
	public Course findCourseByName(@PathVariable String cname)
	{
		return courseService.findCourseByName(cname);
		
	}

}
