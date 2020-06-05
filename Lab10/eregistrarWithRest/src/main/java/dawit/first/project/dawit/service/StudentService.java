package dawit.first.project.dawit.service;


import java.util.List;
import java.util.Optional;

import dawit.first.project.dawit.model.Student;
import org.springframework.data.domain.Page;




public interface StudentService {

   
    List<Student> getAllStudents();
    Student registerNewStudent(Student newStudent);
//    public abstract Page<Student> getAllStudentsPaged(int pageNo);
    //Student saveStudent(Student student);
    Student updateStudent(Student editedStudent, Long studentId);
    Student getStudentById(Long studentId);
    void deleteStudentById(Long studentId);
//    public abstract Optional<Student> findBystudentName(String studentNumber);
//    List<Student> searchStudents(String searchString);
    

}
