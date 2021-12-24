package br.com.tasks;

import java.util.ArrayList;

public class NewTaskList {

    ArrayList<Tasks> tasks = new ArrayList<>();

    public void AddNewTask(Tasks task) {
        this.tasks.add(task);
    }

    public void RemoveTask(int position) {
        this.tasks.remove(position);
    }

    public void DisplayTasks() {
        for (Tasks task : tasks) {
            task.displayTask();
        }
    }

}
