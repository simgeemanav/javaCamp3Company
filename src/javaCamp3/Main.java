package javaCamp3;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "SimgeManav", "abc", "simge", "manav");
		Student student1 = new Student (2, "SılaYagmur","def", "sıla", "yagmur","java", 1);
		Instructor instructor1 = new Instructor (3, "EnginDemirog","ghı", "engin", "demirog","sıla", "homework1");
		
		
		new UserManager();
		User [] users = {user1,student1,instructor1};
		
		for (User user : users) {
			System.out.println(user.getUserName());
			
		}
		
	}

}
