import java.util.ArrayList;
import java.util.Collections;


public class Application {
    public static void main(String[] args) {
        // Create some RationalNumber objects
        RationalNumber rn1 = new RationalNumber(1, 2);
        RationalNumber rn2 = new RationalNumber(3, 4);

        // Test the add() method
        RationalNumber sum = rn1.add(rn2);
        System.out.println(rn1 + " + " + rn2 + " = " + sum);

        // Test the subtract() method
        RationalNumber difference = rn1.subtract(rn2);
        System.out.println(rn1 + " - " + rn2 + " = " + difference);

        // Test the multiply() method
        RationalNumber product = rn1.multiply(rn2);
        System.out.println(rn1 + " * " + rn2 + " = " + product);

        // Test the divide() method
        RationalNumber quotient = rn1.divide(rn2);
        System.out.println(rn1 + " / " + rn2 + " = " + quotient);

        // Test the compareTo() method
        int result = rn1.compareTo(rn2);
        System.out.println(rn1 + " compared to " + rn2 + " = " + result);
        
        
        Task task1 = new Task("Do homework");
        task1.setPriority(Priority.MAX_PRIORITY);
        
        Task task2 = new Task("Clean room");
        task2.setPriority(Priority.MED_PRIORITY);
        
        Process process1 = new Process("Chrome");
        process1.setPriority(Priority.MIN_PRIORITY);
        
        Process process2 = new Process("Eclipse");
        process2.setPriority(Priority.MED_PRIORITY);
        
        // Adding tasks and processes to a list of type ArrayList<Task>
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        
        // Adding processes to a list of type ArrayList<Process>
        ArrayList<Process> processes = new ArrayList<>();
        processes.add(process1);
        processes.add(process2);
        
        // Sorting the lists by priority using Comparable interface
        Collections.sort(tasks);
        Collections.sort(processes);
        
        // Printing the sorted lists
        System.out.println("Tasks sorted by priority:");
        for (Task task : tasks) {
            System.out.println(task.toString());
        }
        
        System.out.println("Processes sorted by priority:");
        for (Process process : processes) {
            System.out.println(process.toString());
        }  
        
        
    }
}
