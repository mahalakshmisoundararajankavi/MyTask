package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Student Name is : Mahalakshmi.S");
	}
	public void studentDept() {
		System.out.println("Student Dept is : B.Tech(IT)");
	}
	public void studentId() {
		System.out.println("Student Id is : 16");
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.deptName();
		s.studentDept();
		s.studentName();
		s.studentId();

	}

}
