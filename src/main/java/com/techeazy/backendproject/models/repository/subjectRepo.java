package com.techeazy.backendproject.models.repository;

import com.techeazy.backendproject.models.subject;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface subjectRepo extends JpaRepository<subject,Integer> {
}
