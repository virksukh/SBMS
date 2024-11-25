package in.india.rest;
import in.india.binding.Course;
import in.india.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CourseRestController {

    @Autowired
    private CourseService courseService;

    @PostMapping(value = "/course",
            consumes = {"application/xml", "application/json"})
    public ResponseEntity<String> createCourse(@RequestBody Course course) {
        String status = courseService.upsert(course);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }

    @GetMapping(value = "/course/{id}",
            produces = {"application/json", "application/xml"})
    public ResponseEntity<Course> getCourseById(@PathVariable Integer id) {
        Course course = courseService.getCourse(id);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }

    @GetMapping(value = "/courses",
            produces = {"application/xml", "application/json"})
    public ResponseEntity<List<Course>> getAllCourses() {
        List<Course> courses = courseService.getAllCourses();
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    @PutMapping(value = "/course",
            consumes = {"application/xml","application/json"})
    public ResponseEntity<String> updateCourse(@RequestBody Course course) {
        String status = courseService.upsert(course);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCourse(@PathVariable Integer id) {
        String status = courseService.deleteCourse(id);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
}
