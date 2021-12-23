package br.com.tasks;

public class Tasks {

    String description;

    public Tasks(String description) { this.description = description; }

    public void displayTask() {
        System.out.println(description);
    }

    public int getTaskLength() { return description.length(); }

}
