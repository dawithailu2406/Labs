package edu.mim.cs.cs425.studentmgmt;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mim.cs.cs425.studentmgmt.model.Classroom;
import edu.mim.cs.cs425.studentmgmt.model.Student;
import edu.mim.cs.cs425.studentmgmt.model.Transcript;
import edu.mim.cs.cs425.studentmgmt.repository.StudentRepository;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {
	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyStudentMgmtAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Classroom c = new Classroom("McLaughlin building", "M105");
		
		Transcript t = new Transcript("Masters in CS ", null);
		Transcript t2 = new Transcript("Masters in CT ", null);
		Transcript t3 = new Transcript("Masters in BS ", null);
		
		
		
		Student student = new Student("000-61=0001", "Anna", "Lynn", "Smith", 3.45, LocalDate.of(2019, 8, 25), t, c);
		Student student1 = new Student("000-61=0004", "Dawit", "T", "Hailu", 3.75, LocalDate.of(2019, 8, 25), t2, c);
		Student student2 = new Student("000-61=0006", "Biniam", "T", "Hailu", 3.75, LocalDate.of(2019, 8, 25), t3, c);
		List<Student> students = Arrays.asList(student, student1, student2);
		
		t.setStudent(student);
		t2.setStudent(student1);
		t3.setStudent(student2);

		c.setStudents(students);
		
		Student saveStudent = saveStudent(student);
		System.out.println(saveStudent);
		
		Student saveStudent1 = saveStudent(student1);
		System.out.println(saveStudent1);
		
		Student saveStudent2 = saveStudent(student2);
		System.out.println(saveStudent2);


	}

	private Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
}
