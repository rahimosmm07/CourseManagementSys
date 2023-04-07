package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Course;

public interface CourseRepository extends JpaRepository<Course,Integer> {
	public Course findCourseBycid(int cid);
	public Course findCourseBycname(String cname);
	

}
