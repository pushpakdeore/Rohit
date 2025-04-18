package com.cap.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "colleges")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class College {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long collegeId;

	private String collegeName;
	private String location;
	private String university;
	private String cutoffDetails;

	public Long getCollegeId() {
		return collegeId;
	}

	public void setId(Long collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getCutoffDetails() {
		return cutoffDetails;
	}

	public void setCutoffDetails(String cutoffDetails) {
		this.cutoffDetails = cutoffDetails;
	}

}
