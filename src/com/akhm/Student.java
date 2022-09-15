package com.akhm;

public class Student {
	
	private String studentName;
	
	public Student()
	{
		System.out.println("ZeroArgument Constructor");
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
		
		System.out.println("Setter Method");
	}
	
	public String toString()
	{
		return "studentName="+studentName;
	}

}
