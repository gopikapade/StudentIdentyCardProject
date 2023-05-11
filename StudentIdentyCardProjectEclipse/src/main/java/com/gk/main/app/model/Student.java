package com.gk.main.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {

	
	@Id
	private Long stuid;
	private String studentName,guardianName,div,standard,email,dob;
	private Long contactno;
	
}
