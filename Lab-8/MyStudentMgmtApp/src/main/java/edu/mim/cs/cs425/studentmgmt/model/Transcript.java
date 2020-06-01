package edu.mim.cs.cs425.studentmgmt.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="transcripts")
public class Transcript {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long transcript_Id;
	@NotBlank(message="degreeName is required")
	private String  degreeTitle;
	@OneToOne(cascade= CascadeType.PERSIST,mappedBy="transcript")
	private Student  student;
	public Transcript() {
		super();
	}
	public Transcript(String degreeTitle, Student student) {
		super();
		this.degreeTitle = degreeTitle;
		this.student = student;
	}
	public Transcript(Long transcriptId, String degreeTitle, Student student) {
		super();
		this.transcript_Id = transcriptId;
		this.degreeTitle = degreeTitle;
		this.student = student;
	}
	@Override
	public String toString() {
		return String.format("Transcript [transcriptId=%s, degreeTitle=%s]", transcript_Id, degreeTitle);
	}
	public Long getTranscript_Id() {
		return transcript_Id;
	}
	public void setTranscript_Id(Long transcript_Id) {
		this.transcript_Id = transcript_Id;
	}
	public String getDegreeTitle() {
		return degreeTitle;
	}
	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}
