package in.india.service;
import in.india.binding.Course;
import in.india.repo.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public String upsert(Course course) {
        Course savedCourse = courseRepository.save(course);
        return "success";
    }

    @Override
    public Course getCourse(Integer id) {
        Optional<Course> byId = courseRepository.findById(id);
        if(byId.isPresent()) {
            return byId.get();
        }
        return null;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public String deleteCourse(Integer id) {
       if(courseRepository.existsById(id)) {
           courseRepository.deleteById(id);
           return "delete success";
       }
       return "course not found";
    }
}

