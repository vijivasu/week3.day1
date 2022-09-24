package week3.Assignments;

import college.College;
import department.Department;

public class Student {
	
	public String studentName() {
		return "Viji";
		
	}
	public String studentDept() {
		return "Software Engineer";
		
	}
	public int studentId() {
	return 2342956;
}
	public static void main(String[] args) {
		
		Student info =new Student();
		info.studentDept();
		info.studentId();
		info.studentName();
		
		College info2 = new College();
		info2.collegeCode();
		info2.collegeName();
		info2.collegeRank();
		
		Department dept = new Department();
		dept.deptName();
		
		
	}

}
