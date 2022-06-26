package com.example.assignment_java.repository;

import com.example.assignment_java.entity.Districts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictsRepository extends JpaRepository<Districts, Integer> {
}
