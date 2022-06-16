package br.com.todo_list;

import java.util.ArrayList;

public class ListaTarefas {

    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }

    public void removerTarefa(int posicao) {
        this.tarefas.remove(posicao);
    }

    public void exibirTarefas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.exibirTarefa();
        }
    }
}
