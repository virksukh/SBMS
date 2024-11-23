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
        courseRepository.save(course);
        return "success";
    }

    @Override
    public Course getById(Integer cid) {
        Optional<Course> byId = courseRepository.findById(cid);
        return byId.orElse(null);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public String deleteById(Integer cid) {
        if(courseRepository.existsById(cid)) {
            courseRepository.deleteById(cid);
            return "deleted";
        }else {
            return "Course not found";
        }
    }
}
