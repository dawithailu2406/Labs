package edu.mim.cs.cs425.studentmgmt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mim.cs.cs425.studentmgmt.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}
