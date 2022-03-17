package javaCamp3;

public class InstructorManager {
	
	public void add (User user) {
		System.out.println("Yeni kullanıcı eklendi:" + user.getUserName() );
	}
	public void delete (User user) {
		System.out.println("Kullanıcı silindi:" + user.getUserName() );
	}

}
