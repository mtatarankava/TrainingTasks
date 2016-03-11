package task1;

import java.util.Comparator;

public class Student{
	public int group;	
	public String lastName;	
	public float averageScore;
	
	public Student(int group, String lastName, int result1, int result2, int result3){
		this.group = group;
		this.lastName = lastName;
		this.averageScore = (result1 + result2 + result3)/3;
	}
	
	@Override
	public String toString() {
		 return "[ group=" + this.group + ", score=" + this.averageScore + ", Last Name=" + this.lastName + "]";
	}
	 
	 public static Comparator<Student> StudentComparator = new Comparator<Student>(){

		    @Override
		    public int compare(Student s1, Student s2){
		        if(s1.group > s2.group){
		            return 1;
		        }
		        if(s1.group < s2.group){
		            return -1;
		        }
		        if(s1.averageScore < s2.averageScore){
		            return 1;
		        }
		        if(s1.averageScore > s2.averageScore){
		            return -1;
		        }
		        return s1.lastName.compareTo(s2.lastName);
		    }
		};
}
