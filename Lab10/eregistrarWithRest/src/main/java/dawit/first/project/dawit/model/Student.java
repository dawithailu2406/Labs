package dawit.first.project.dawit.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    @NotBlank
    private Boolean isInternational;
    public Student(@NotBlank(message = "studentId is required") String studentNumber,
            @NotBlank(message = "first name is required") String fName, String mName,
            @NotBlank(message = "last  name is required") String lName, Double cgpa, LocalDate dateOfEnrollement,
            @NotBlank Boolean isInternational) {
        super();
        this.studentNumber = studentNumber;
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.cgpa = cgpa;
        this.dateOfEnrollement = dateOfEnrollement;
        this.isInternational = isInternational;
    }
    public Student(Long studentId, @NotBlank(message = "studentId is required") String studentNumber,
            @NotBlank(message = "first name is required") String fName, String mName,
            @NotBlank(message = "last  name is required") String lName, Double cgpa, LocalDate dateOfEnrollement,
            @NotBlank Boolean isInternational) {
        super();
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.cgpa = cgpa;
        this.dateOfEnrollement = dateOfEnrollement;
        this.isInternational = isInternational;
    }
    public Student() {
        super();
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
    public Boolean getIsInternational() {
        return isInternational;
    }
    public void setIsInternational(Boolean isInternational) {
        this.isInternational = isInternational;
    }
    @Override
    public String toString() {
        return String.format(
                "Student [studentId=%s, studentNumber=%s, fName=%s, mName=%s, lName=%s, cgpa=%s, dateOfEnrollement=%s, isInternational=%s]",
                studentId, studentNumber, fName, mName, lName, cgpa, dateOfEnrollement, isInternational);
    }


}
