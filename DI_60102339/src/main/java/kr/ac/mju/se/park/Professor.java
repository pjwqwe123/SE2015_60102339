package kr.ac.mju.se.park;

public class Professor {

	private String Name;
	private Lecture lecture;

	public Professor() {

	}

	public Professor(String name) {
		this.setName(name);
	}

	public String getName() {
		return this.Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public void addLecture(Lecture lecture) {
		// TODO Auto-generated method stub
		this.lecture = lecture;
	}

	public void showLecture() {
		// TODO Auto-generated method stub
		System.out.println(this.lecture.getName());
		System.out.println(this.lecture.getStudent());
	}

}
