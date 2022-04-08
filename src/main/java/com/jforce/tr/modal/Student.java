package com.jforce.tr.modal;

import javax.persistence.*;

@Entity
@Table(name = "student")

public class Student {

	@Id
	private Integer Id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;

	public Student() {
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
