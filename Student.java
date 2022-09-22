package org.student;
import org.dept.Dept;

public abstract class Student extends Dept  {
	public void StudentName() {
	}
	abstract void StudentDept();
	void StudentId() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student() {

			@Override
			void StudentDept() {
				// TODO Auto-generated method stub
				
			}
			

				
			
		};
		obj.StudentDept();
		obj.DeptName();
		obj.CollegeCode();
		obj.CollegeName();
		obj.StudentId();
		obj.StudentName();
		
	}

}
