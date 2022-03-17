package javaCamp3;

public class StudentManager {
	
	public void add(User user) {
		System.out.println("Kayıt olan öğrenci adı:" + user.getFirstName() + "soyadı" + user.getLastName());
	}
	
	public void delete(User user) {
		System.out.println("Silinen öğrenci adı:" + user.getFirstName() + "soyadı" + user.getLastName());
	}

}
