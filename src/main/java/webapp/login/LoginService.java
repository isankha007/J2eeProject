package webapp.login;

public class LoginService {
  public boolean isValidUser(String user,String password) {
	return user.equals("Sankhadeep")&&password.equalsIgnoreCase("password")?true:false;
}
}
