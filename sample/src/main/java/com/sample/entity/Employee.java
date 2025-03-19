package com.sample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	private Long id;
	private String name;
	private int age;
}
