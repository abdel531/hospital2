package com.javatechie.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Doctor {
	@Id
	private int doctor_id;
	private String name;
	private int age;
	private String gender;
	private String service;
	private String adress;

}
