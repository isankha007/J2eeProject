package webapp;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
    private static List<Todolist> todos= new ArrayList<Todolist>();
    static {
    	todos.add(new Todolist("learn web app"));
    	todos.add(new Todolist("learn spring app"));
    	todos.add(new Todolist("learn spring rest"));
    }
    public List<Todolist> retriveTodos() {
		return todos;
		
	}
}
