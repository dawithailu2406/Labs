package edu.mim.cs.cs425.studentmgmt.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "classrooms")
public class Classroom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ClassroomId;
	@NotBlank(message = "buildingName is required")
	private String buildingName;
	@NotBlank(message = "roomnumber is required")
	private String roomNumber;
	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "classroom")
	private List<Student> students;

	public Classroom(Long classroomId, String buildingName, String roomNumber, List<Student> students) {
		super();
		ClassroomId = classroomId;
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
		this.students = students;
	}

	public Classroom(String buildingName, String roomNumber, List<Student> students) {
		super();
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
		this.students = students;
	}

	public Classroom() {
		super();
	}


	public Classroom(@NotBlank(message = "buildingName is required") String buildingName,
			@NotBlank(message = "roomnumber is required") String roomNumber) {
		super();
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
	}

	public Long getClassroomId() {
		return ClassroomId;
	}

	public void setClassroomId(Long classroomId) {
		ClassroomId = classroomId;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return String.format("Classroom [ClassroomId=%s, buildingName=%s, roomNumber=%s]", ClassroomId,
				buildingName, roomNumber);
	}

}
