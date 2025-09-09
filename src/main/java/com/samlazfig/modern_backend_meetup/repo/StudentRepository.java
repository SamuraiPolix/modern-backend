package com.samlazfig.modern_backend_meetup.repo;

import com.samlazfig.modern_backend_meetup.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
}
