
package dataAccess;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import common.Library;
import common.Validate;
import model.Student;

public class StudentManagement {
	private final Library library = new Library();
	private final Validate validate = new Validate();
	private static StudentManagement instance = null;

	public static StudentManagement Instance() {
		if (instance == null) {
			synchronized (StudentManagement.class) {
				if (instance == null) {
					instance = new StudentManagement();
				}
			}
		}
		return instance;
	}

	boolean check = false;

	public void addStudent(ArrayList<Student> ls) {

		if (!check) {
			System.out.println("====== Collection Sort Program =====");
			check = true;
		}
		System.out.println("Please input student information ");
		System.out.print("Name: ");
		String name = validate.checkInputString();
		System.out.print("Classes: ");
		String classes = validate.checkInputString();
		System.out.print("Mark: ");
		float mark = validate.checkInputFloat();
		ls.add(new Student(name, mark, classes));
	}

	public List<Student> sortStudent(ArrayList<Student> ls) {
		Collections.sort(ls);
		return ls;
	}

	public void displayListStudent(ArrayList<Student> ls) {

		if (ls.isEmpty()) {
			System.err.println("List empty.");
			return;
		}

		List<Student> l = sortStudent(ls);

		int i = 0;
		for (Student student : l) {
			System.out.println("--------Student " + ++i + "--------");
			System.out.println("Name: " + student.getName());
			System.out.println("Classes: " + student.getClasses());
			System.out.println("Mark: " + student.getMark());
		}
	}

	public void display(ArrayList<Student> ls) {
		addStudent(ls);
		while (true) {
			System.out.print("Do you want to enter more student information?(Y/N): ");
			if (library.checkInputYN()) {
				addStudent(ls);

			} else {
				break;
			}
		}
		displayListStudent(ls);
	}

}