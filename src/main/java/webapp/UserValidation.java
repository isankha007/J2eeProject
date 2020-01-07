package webapp;

public class UserValidation {
  public boolean isValidUser(String user,String password) {
	return user.equals("Sankhadeep")&&password.equalsIgnoreCase("password")?true:false;
}
}
