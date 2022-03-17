package javaCamp3;

public class UserManager {
	
	public void add (User user) {
		System.out.println(user.getUserName() + " Kullanıcısı eklendi.");
	}
	public void delete(User user) {
		System.out.println(user.getUserName() + " Kullanıcısı silindi.");
	}
	public void update(User user) {
		System.out.println(user.getUserName() + " Kullanıcısı güncellendi.");
	}
	

}
