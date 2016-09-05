package com.tutorialspoint.annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.tutorialspoint.annotation.SpellChecker;
import com.tutorialspoint.annotation.Student;

public class Profile {
	@Autowired
	@Qualifier("student1")
	private Student student;

	public Profile(){
		System.out.println("Profile constructor");
	}
	
	public void printName(){
		System.out.println("Name: " + student.getName());
	}
	public void printAge(){
		System.out.println("Age: " + student.getAge());
	}
}
