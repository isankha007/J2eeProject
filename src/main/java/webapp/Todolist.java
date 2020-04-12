package webapp;

public class Todolist {
  private String name;
  public Todolist(String name) {
	  super();
	  this.name = name;
  }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Todolist [name=" + name + "]";
}
 
  
}
