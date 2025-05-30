package cl.edutech.courseservice.service;

import cl.edutech.courseservice.model.Course;
import cl.edutech.courseservice.repository.CourseRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    public Course findById(String id) {
        return courseRepository.findById(id).get();
    }

    public Course create (Course course){
        return courseRepository.save(course);
    }

    public void remove (String id){
        courseRepository.deleteById(id);
    }
}
