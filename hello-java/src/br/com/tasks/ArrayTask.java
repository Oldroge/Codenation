package br.com.tasks;

public class ArrayTask {
    Tasks[] tasks;
    int counter = 0;

    public ArrayTask(int size) {
        tasks = new Tasks[size];
    }

    public void AddNewTask(Tasks task) {
        tasks[counter] = task;
        counter++;
    }

    public void RemoveTask(int position) {
        tasks[position] = null;
    }

    public void DisplayTasks() {
        for(Tasks tasks : tasks) {
            tasks.displayTask();
        }
    }
}
