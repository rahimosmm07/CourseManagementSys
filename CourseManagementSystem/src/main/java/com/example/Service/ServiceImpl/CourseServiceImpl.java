package com.example.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Entity.Course;
import com.example.Repository.CourseRepository;
import com.example.Service.CourseService;
@Repository
public class CourseServiceImpl  implements CourseService{
	@Autowired
	CourseRepository courseRepository;

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	public void deleteCourseById(int cid) {
		// TODO Auto-generated method stub
		courseRepository.deleteById(cid);
		
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		Course _course =courseRepository.findCourseBycid(course.getCid());
		_course.setCid(course.getCid());
		_course.setCname(course.getCname());
		courseRepository.save(_course);
		return _course;
	}

	//@Override
	//public Course findCourseById(int cid) {
		// TODO Auto-generated method stub
		//return null;
	//}

	@Override
	public Course findCourseByName(String cname) {
		// TODO Auto-generated method stub
		return courseRepository.findCourseBycname(cname);
	}

	@Override
	public Course findCourseById(int cid) {
		// TODO Auto-generated method stub
		return courseRepository.findCourseBycid(cid) ;
	}
	

}
