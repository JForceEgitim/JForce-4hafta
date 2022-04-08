package com.jforce.tr.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jforce.tr.modal.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	Optional<Student> findById(Integer id);
}
