package io.sheena.springbootstarter.courses;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//creating a business service
//spring creates the instance of all the business services
@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId) {
		List<Course> courses=new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
	}
	
	public Optional<Course> getCourse(String id)
	{
		return courseRepository.findById(id);
	}

	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		courseRepository.save(course);
	}

	public void updateCourse(Course course, String id) {
		// TODO Auto-generated method stub
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		// TODO Auto-generated method stub
		courseRepository.deleteById(id);
	}

}

