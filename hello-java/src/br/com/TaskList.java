package br.com;

import br.com.tasks.Tasks;

public class TaskList {

    public static void main(String[] args) {
        System.out.println("My tasks");
        System.out.println("==================");
        Tasks task1 = new Tasks("Water the plants");
        task1.displayTask();
        System.out.println("The task have " + task1.getTaskLength());
    }
}
