package webapp;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
    private static List<Todolist> todos= new ArrayList<Todolist>();
    static {
    	todos.add(new Todolist("learn web app",1,"Programming"));
    	todos.add(new Todolist("learn spring app",2,"Testing"));
    	todos.add(new Todolist("learn spring rest",3,"Testing"));
    }
    public List<Todolist> retriveTodos() {
		return todos;
		
	}
   public void addTodo(Todolist todo) {
		todos.add(todo);
	}
   public void deleteodo(Todolist todo) {
		todos.remove(todo);
	}
}
