import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Hello world!");
        TodoList todoList = new TodoList();

        while (true){
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. Display Tasks");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            if (choice == 1){
                System.out.println("Enter task description:");
                scanner.nextLine(); // Consume newline
                String task = scanner.nextLine();
                todoList.addTask(task);
            }
            else if (choice == 2){
                System.out.println("Enter the index of the task to mark as completed:");
                int index = scanner.nextInt();
                todoList.completedTask(index - 1); // Adjust index for user input
            }
            else if (choice == 3){
                todoList.displayTasks();
            } else if (choice == 4) {
                System.out.println("Exiting the program.");
                scanner.close();
                System.exit(0);
            }
            else{
                System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}