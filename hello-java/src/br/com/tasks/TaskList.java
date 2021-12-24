package br.com.tasks;

public class TaskList {

    public static void main(String[] args) {
        System.out.println("My tasks");
        System.out.println("==================");
        ArrayTask tasks = new ArrayTask(3);
        Tasks task1 = new Tasks("Water plants");
        Tasks task2 = new Tasks("To study");
        Tasks task3 = new Tasks("To work");
        tasks.AddNewTask(task1);
        tasks.AddNewTask(task2);
        tasks.AddNewTask(task3);
        tasks.DisplayTasks();
    }
}
