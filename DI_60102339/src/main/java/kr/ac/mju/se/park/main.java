package kr.ac.mju.se.park;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Professor professor = new Professor("choi");
//		Lecture lecture = new Lecture("소프트웨어 공학 ");
//		
	//	Student student = new Student("소프트웨어 공학 ");
		ApplicationContext factory = new ClassPathXmlApplicationContext(
				new String[]{"ApplicationContext.xml"});
		
		Professor professor = (Professor)factory.getBean("professor");
		Lecture lecture = (Lecture)factory.getBean("Lecture"); //생성자로 bean을 생성하는 방법
		Student student = (Student)factory.getBean("student");
		
		
		
		professor.addLecture(lecture);
		lecture.addStudent(student);
		
		professor.showLecture();
		
		
	}

}
