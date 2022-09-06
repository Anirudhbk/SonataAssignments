package com.sonata.assignment;

public class Student {
	int stdID,stdClass;
	String stdName;
	Student( int id , String name , int cls ) {
		this.stdID = id;
		this.stdName = name;
		this.stdClass = cls;
	}

	public static void main(String[] args) {
		Student s1 = new Student ( 22768 , "Anirudh" , 9 );
		Student s2 = new Student ( 22769 , "Dharma" , 10 );
		System.out.println( "Student ID - " + s1.stdID + "\nStudent Name - " + s1.stdName + "\nStudent Class - " + s1.stdClass + "\n--------------------------------------------------" );
		System.out.println( "Student ID - " + s2.stdID + "\nStudent Name - " + s2.stdName + "\nStudent Class - " + s2.stdClass + "\n--------------------------------------------------" );
	}

}
