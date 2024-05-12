package com.tnsif.PlacementManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.PlacementManagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
