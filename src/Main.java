import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Task\n2. View Tasks\n3. Mark Task Done\n4. Delete Task\n5. Exit");
            System.out.print("Choose: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String title = scanner.nextLine();
                    manager.addTask(title);
                    break;
                case 2:
                    manager.listTasks();
                    break;
                case 3:
                    manager.listTasks();
                    System.out.print("Task number to mark done: ");
                    int doneIndex = scanner.nextInt() - 1;
                    manager.markTaskDone(doneIndex);
                    break;
                case 4:
                    manager.listTasks();
                    System.out.print("Task number to delete: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    manager.deleteTask(deleteIndex);
                    break;
                case 5:
                    manager.saveTasks();
                    System.out.println("Goodbye!");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}
