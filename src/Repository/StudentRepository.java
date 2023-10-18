
package Repository;

import java.util.ArrayList;

import dataAccess.StudentManagement;
import model.Student;

public class StudentRepository implements IStudentRepository{

	
	@Override
	public void addStudent(ArrayList<Student> ls) {
		StudentManagement.Instance().addStudent(ls);
		
	}

	@Override
	public void displayListStudent(ArrayList<Student> ls) {
		StudentManagement.Instance().displayListStudent(ls);
		
	}

	@Override
	public void display(ArrayList<Student> ls) {
		StudentManagement.Instance().display(ls);
		
	}
	
	
}
