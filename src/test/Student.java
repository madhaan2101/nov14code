package test;

public class Student {
	private String studentName;
	private float marks;
	public Student() {
		
	}
	
	public Student(String studentName, float marks) {
		super();
		this.studentName=studentName;
		this.marks=marks;
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", marks=" + marks + "]";
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
}	
