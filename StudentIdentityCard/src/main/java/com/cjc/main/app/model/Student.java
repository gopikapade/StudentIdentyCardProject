package com.cjc.main.app.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
	
	
	private Long stuRoll;
	private String name,guadianName,address,dob,email;
	private Long contactno;

}
