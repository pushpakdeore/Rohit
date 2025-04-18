package com.cap.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.main.entity.CapForm;

/**
 * CapRepository provides CRUD operations for CapForm entities.
 * It extends JpaRepository for easy database interaction.
 */
@Repository
public interface CapRepository extends JpaRepository<CapForm, Long> {

    /**
     * Find all CapForms associated with a specific college.
     *
     * @param collegeId the ID of the college.
     * @return a list of CapForms for the specified college.
     */
    List<CapForm> findByCollegeId(Long collegeId);
}
