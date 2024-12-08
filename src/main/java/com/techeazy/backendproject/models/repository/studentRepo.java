package com.techeazy.backendproject.models.repository;

import com.techeazy.backendproject.models.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepo extends JpaRepository<student,Integer> {
}
