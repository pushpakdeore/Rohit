package com.cap.main.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "cap_forms")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class CapForm {
	// Other fields
	@Id
	private Long id;
	@Column(name = "college_id")
	private Long collegeId;

	// Getters and setters

	public Long getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}
}