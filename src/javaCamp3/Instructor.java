package javaCamp3;

public class Instructor extends User {
	private String myStudents;
	private String addHomework; 
	
	public Instructor() {
		
	}
	
	

	public Instructor(int id, String userName,String password, String firstName, String lastName,String myStudents, String addHomework) {
		super(id,userName,password,firstName,lastName);
		this.myStudents = myStudents;
		this.addHomework = addHomework;
	}



	public String getMyStudents() {
		return myStudents;
	}

	public void setMyStudents(String myStudents) {
		this.myStudents = myStudents;
	}

	public String getAddHomework() {
		return addHomework;
	}

	public void setAddHomework(String addHomework) {
		this.addHomework = addHomework;
	}
	
	

}
