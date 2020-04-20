package webapp;

import java.util.ArrayList;
import java.util.List;

import com.sun.tools.javac.comp.Todo;

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
   public void addTodo(Todolist todo) {
		todos.add(todo);
	}
   public void deleteodo(Todolist todo) {
		todos.remove(todo);
	}
}
