package day25.activity;
import java.util.Scanner;
import java.util.ArrayList;

public class TodoManager {
    
    public void todo(){
      Scanner scanner = new Scanner(System.in);
      ArrayList<String> task = new ArrayList(6);
      
      while(true){
        System.out.println("======Task Manager=======");
        System.out.println("\n[1]Add a task\n[2]View all task\n[3]Update a task\n[4]Remove a task\n[5]Clear all task\n[6]Exit");
        
        System.out.print("\nWhat can we do for you? ");
        int choice = scanner.nextInt();
        System.out.println("");
        scanner.nextLine();
        
        
        switch(choice){
            case 1:
                System.out.print("Enter the task to add: ");
                    String newTask = scanner.nextLine().trim();
                    if (!newTask.isEmpty()) {
                        task.add(newTask);
                        System.out.println("Task added successfully!");
                    } else {
                        System.out.println("Task cannot be empty.");
                    }
                    break;
            case 2:
                if (task.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.println("Your tasks:");
                        for (int i = 0; i < task.size(); i++) {
                            System.out.println((i + 1) + ". " + task.get(i));
                        }
                        System.out.println();
                    }
                    break;
            case 3:
                if (task.isEmpty()) {
                        System.out.println("No tasks to update.");
                        break;
                    }
                    System.out.print("Enter the index of the task to update (1-based): ");
                    int updateIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consume newline
                    if (updateIndex >= 0 && updateIndex < task.size()) {
                        System.out.print("Enter the new task: ");
                        String updatedTask = scanner.nextLine().trim();
                        if (!updatedTask.isEmpty()) {
                            task.set(updateIndex, updatedTask);
                            System.out.println("Task updated successfully!");
                        } else {
                            System.out.println("Task cannot be empty.");
                        }
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
            case 4:
                if (task.isEmpty()) {
                        System.out.println("No tasks to remove.");
                        break;
                    }
                    System.out.print("Enter the index of the task to remove (1-based): ");
                    int removeIndex = scanner.nextInt() - 1;
                    scanner.nextLine();
                    if (removeIndex >= 0 && removeIndex < task.size()) {
                        task.remove(removeIndex);
                        System.out.println("Task removed successfully!");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
            case 5:
                task.clear();
                    System.out.println("All tasks cleared!");
                    break;
            case 6:
                System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
      }
      
      

      
      

      
    }   
}
