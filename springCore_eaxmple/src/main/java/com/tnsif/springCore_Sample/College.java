package com.tnsif.springCore_Sample;

public class College {

	private Student student;

	public void setStudent(Student student) {
		this.student = student;
	}

	public void display() {
		System.out.println("vanakam");
		student.display();
	}
	
	public College() {
		System.out.println("College object is created.");
	} //manual object creations
}
