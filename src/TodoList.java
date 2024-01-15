import java.util.ArrayList;

public class TodoList {
    //Attributes
    private ArrayList<String> tasks;
    //Constructor
    public TodoList(){
        tasks = new ArrayList<>();
    }
    //methods
    public void addTask(String task){
        tasks.add(task);
        System.out.println("task added");
    }
    public void completedTask(int index){
        if (index >= 0 && index < tasks.size()) {
            String completedTask = tasks.get(index);
            tasks.remove(index);
            System.out.println("Task completed: " + completedTask);
        } else {
            System.out.println("Invalid task index");
        }
    }
    public void displayTasks(){
        System.out.println("Tasks:");

        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}
