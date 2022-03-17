package javaCamp3;

public class Student extends User{
	private String myCourse;
	private int completedCourse;
	
	public Student() {
	}
	

	public Student(int id, String userName,String password, String firstName, String lastName,String myCourse, int completedCourse) {
		super(id,userName,password,firstName,lastName);
		this.myCourse = myCourse;
		this.completedCourse = completedCourse;
	}



	public String getMyCourse() {
		return myCourse;
	}

	public void setMyCourse(String myCourse) {
		this.myCourse = myCourse;
	}

	public int getCompletedCourse() {
		return completedCourse;
	}

	public void setCompletedCourse(int completedCourse) {
		this.completedCourse = completedCourse;
	}
	
	
	
	
}
