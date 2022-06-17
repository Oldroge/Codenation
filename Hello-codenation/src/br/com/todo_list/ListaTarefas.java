package br.com.todo_list;

import java.util.ArrayList;

public class ListaTarefas {

    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        if (tarefa != null && tarefa.obterTamanhoDaTarefa() <= 20) {
            this.tarefas.add(tarefa);
        } else {
            System.out.println("Tarefa inválida");
        }
    }

    public void adicionarTarefa(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);

        this.adicionarTarefa(tarefa);
    }

    public void removerTarefa(int posicao) {
        if (posicao < this.tarefas.size()) {
            this.tarefas.remove(posicao);
        } else {
            System.out.println("Tarefa invalida");
        }
    }

    public void removerTarefa(Tarefa tarefa) {
        this.tarefas.remove(tarefa);
    }

    public Tarefa buscarTarefa(String descricao) {
        for (Tarefa tarefa : tarefas) {
            if (descricao.equals(tarefa.descricao)) {
                return tarefa;
            }
        }
        System.out.println("Tarefa não encontrada");
        return null;
    }

    public void exibirTarefas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.exibirTarefa();
        }
    }
}
