package edu.mim.cs.cs425.studentmgmt.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="Students")
public class Student {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long studentId;
	@NotBlank(message="studentId is required")
	@Column(unique=true,nullable=false)
	private String studentNumber;
	@NotBlank(message="first name is required")
	private String fName;
	private String mName;
	@NotBlank(message="last  name is required")
    private String lName;
	private Double cgpa;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate dateOfEnrollement;
	
	@OneToOne(cascade= CascadeType.PERSIST)
	@JoinColumn(nullable=false)
	private Transcript transcript;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(nullable=false)
	private Classroom classroom;
	
		public Student() {
		
	}
	public Classroom getClassroom() {
			return classroom;
		}
		public void setClassroom(Classroom classroom) {
			this.classroom = classroom;
		}
	public Student(String studentNumber, String fName, String mName, String lName, Double cgpa,
			LocalDate dateOfEnrollement, Transcript transcript,Classroom classroom) {
		super();
		this.studentNumber = studentNumber;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.cgpa = cgpa;
		this.dateOfEnrollement = dateOfEnrollement;
		this.transcript = transcript;
		this.classroom=classroom;
	}
	public Student(Long studentId, String studentNumber, String fName, String mName, String lName, Double cgpa,
			LocalDate dateOfEnrollement, Transcript transcript,Classroom classroom) {
		super();
		this.studentId = studentId;
		this.studentNumber = studentNumber;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.cgpa = cgpa;
		this.dateOfEnrollement = dateOfEnrollement;
		this.transcript = transcript;
		this.classroom=classroom;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Double getCgpa() {
		return cgpa;
	}
	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}
	public LocalDate getDateOfEnrollement() {
		return dateOfEnrollement;
	}
	public void setDateOfEnrollement(LocalDate dateOfEnrollement) {
		this.dateOfEnrollement = dateOfEnrollement;
	}
	public Transcript getTranscript() {
		return transcript;
	}
	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}
	@Override
	public String toString() {
		return String.format(
				"Student [studentId=%s, studentNumber=%s, fName=%s, mName=%s, lName=%s, cgpa=%s, dateOfEnrollement=%s, transcript=%s,classroom=%s]",
				studentId, studentNumber, fName, mName, lName, cgpa, dateOfEnrollement, transcript,classroom);
	}
	
	
	
	
	
	
	

}
