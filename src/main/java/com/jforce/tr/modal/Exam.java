package com.jforce.tr.modal;

import javax.persistence.*;

@Entity
@Table(name = "exam")

public class Exam {

	@Id
	private Integer NumberId;
	@Column(name = "student_name")
	private String StudentName;
	@Column(name = "address")
	private String Address;
	@Column(name = "sınav_ortalaması")
	private Integer SınavOrtalaması;

	public Exam() {

	}

	public Integer getNumberId() {
		return NumberId;
	}

	public void setNumberId(Integer numberId) {
		NumberId = numberId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public Integer getSınavOrtalaması() {
		return SınavOrtalaması;
	}

	public void setSınavOrtalaması(Integer sınavOrtalaması) {
		SınavOrtalaması = sınavOrtalaması;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
}
