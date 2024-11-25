package in.india.service;
import in.india.binding.Course;
import java.util.List;

public interface CourseService {

    public String upsert(Course course);
    public Course getCourse(Integer id);
    public List<Course> getAllCourses();
    public String deleteCourse(Integer id);
}
