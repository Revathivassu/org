package org.student;

import org.department.Department;

public class Student extends Department {
   public void studentName() {
	   System.out.println("Student Name");
   }
   public void studentDept() {
	   System.out.println("Student Department");
   }
   public void studentId() {
	   System.out.println("Student Id");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptName();
		std.studentName();
		std.studentDept();
		std.studentId();
           
	}

}
