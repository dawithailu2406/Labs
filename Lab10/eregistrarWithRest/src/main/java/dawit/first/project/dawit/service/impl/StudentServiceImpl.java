package dawit.first.project.dawit.service.impl;

import java.util.List;
import java.util.Optional;

import dawit.first.project.dawit.model.Student;
import dawit.first.project.dawit.repository.StudentRepository;
import dawit.first.project.dawit.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;



@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	
	

//      @Override
//     public Iterable<Student> getAllStudents() {
//          return ((List<Book>)repository.findAll())
//                  .stream()
//                  .sorted(Comparator.comparing(Book::getTitle))
//                  .collect(Collectors.toList());
//          return studentRepository.findAll(Sort.by("fName"));
//        return studentRepository.findAll(PageRequest.of(pageNo, 3, Sort.by("fName")));
	// }
//	@Override
//	public Student saveStudent(Student student) {
//		return studentRepository.save(student);
//	}

	@Override
	public Student getStudentById(Long studentId)
	{
		return studentRepository.findById(studentId).orElse(null);
	}

	@Override
	public Student updateStudent(Student editedStudent, Long studentId) {
		return studentRepository.findById(studentId)
				.map(student -> {
					student.setfName(editedStudent.getfName());
					student.setmName(editedStudent.getmName());
					student.setlName(editedStudent.getlName());
					student.setStudentNumber(editedStudent.getStudentNumber());
					student.setCgpa(editedStudent.getCgpa());
					student.setIsInternational(editedStudent.getIsInternational());
					student.setDateOfEnrollement(editedStudent.getDateOfEnrollement());
					return studentRepository.save(student);
				}).orElseGet(() -> {
					return studentRepository.save(editedStudent);
				});

	}
	@Override
	public Student registerNewStudent(Student newStudent) {
		return studentRepository.save(newStudent);
	}
	@Override
	public void deleteStudentById(Long studentId) {
		studentRepository.deleteById(studentId);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}
