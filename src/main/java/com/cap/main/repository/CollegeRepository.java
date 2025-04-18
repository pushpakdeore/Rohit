package com.cap.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.main.entity.CapForm;
import com.cap.main.entity.College;

/**
 * CollegeRepository provides CRUD operations for College entities.
 * It extends JpaRepository for easy database interaction.
 */
@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {

    /**
     * Find a College by its name.
     *
     * @param name the name of the college.
     * @return an Optional containing the college if found, or empty if not.
     */
	List<CapForm> findByCollegeId(Long collegeId);
}
