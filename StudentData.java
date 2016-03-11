package task1;

import java.util.ArrayList;
import java.util.Collections;
/*
 * studentData
 */

public class StudentData {
	
	

	public static void main(String[] args) {
		ArrayList<Student> studentData = new ArrayList<Student>();
		studentData.add(new Student(2, "LastName", 2, 3, 2));
		studentData.add(new Student(1, "Tatarankau", 5, 6, 5));
		studentData.add(new Student(1, "Ray", 2, 2, 2));
		studentData.add(new Student(1, "Kate", 2, 2, 2));
		studentData.add(new Student(1, "Bella", 2, 2, 2));
		studentData.add(new Student(1, "Alla", 2, 2, 2));
		studentData.add(new Student(1, "Tatarankava", 8, 9, 10));
		studentData.add(new Student(3, "LastName4", 2, 3, 2));
		studentData.add(new Student(3, "LastName7", 2, 3, 2));
		studentData.add(new Student(3, "LastName1", 2, 3, 2));
		studentData.add(new Student(3, "LastName2", 2, 3, 2));
		Collections.sort(studentData, Student.StudentComparator);
		for(Student sd: studentData){
			System.out.println(sd);
	   }
	}

}
