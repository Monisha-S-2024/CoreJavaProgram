package com.tnsif.statickeyword;

public class Student {

	int rollno;
	String name;
	static String college ="Reva";
	
	// Static method change value 
	
	static void change () {
		college ="Reva";
	}
	Student (int r,String n){
		rollno =r;
		name=n;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	
	}
	
}
