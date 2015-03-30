package kr.ac.mju.se.park;

public class Lecture {

	
	private String name;
	private String Student;
	public Lecture()
	{}
	
	public Lecture(String name){
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudent() {
		return Student;
	}
	
	public void addStudent(Student student2) {
		// TODO Auto-generated method stub
		this.Student = student2.getName();
	}


}
