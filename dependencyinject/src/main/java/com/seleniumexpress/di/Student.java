package com.seleniumexpress.di;

public class Student {

	private int id;
	private String studentName;
	
	//SETTER METHOD
	/*public void setId(int id) {
		this.id = id;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
*/
	//CONSTRUCTOR METHOD

	public Student(int id, String studentName) {
		
		this.id = id;
		this.studentName = studentName;
	}


	public void display() {
		System.out.println("Student Name: "+studentName);
		System.out.println("Student ID: "+id);
	}

	
}
