package dawit.first.project.dawit.controller;
import javax.validation.Valid;
import dawit.first.project.dawit.model.Student;
import dawit.first.project.dawit.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(value = "/searchregistrar")
public class StudentController {

	private StudentService studentService;

	@Autowired
	public StudentController(StudentService studentService) {

		this.studentService = studentService;
	}

@PutMapping(value = "/update/{studentId}")
public Student updateStudent(@Valid @RequestBody Student editedStudent, @PathVariable Long studentId) {
	return studentService.updateStudent(editedStudent,studentId);
}
	@PostMapping(value = "/add")
	public Student registerNewStudent(@Valid @RequestBody Student student) {
		return studentService.registerNewStudent(student);
	}

		@DeleteMapping(value = "/delete/{studentId}")
		public void deletePublisher(@PathVariable Long studentId) {
		studentService.deleteStudentById(studentId);
		}

	@GetMapping(value = { "/get/{studentId}" })
	public Student getStudent(@PathVariable Long studentId) {
		return studentService.getStudentById(studentId);

	}
 @GetMapping(value =  "/getAll" )
public List<Student> getAllStudent( ) {
	return studentService.getAllStudents();

}


}
