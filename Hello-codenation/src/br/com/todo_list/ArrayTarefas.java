package br.com.todo_list;

public class ArrayTarefas {

    Tarefa[] tarefas;
    int contador = 0;

    public ArrayTarefas(int tamanho) {
        tarefas = new Tarefa[tamanho];
    }

    public void adicionarTarefa(Tarefa addTarefa) {
        tarefas[contador] = addTarefa;
        contador++;
    }

    public void removerTarefa(int posicao) {
        tarefas[posicao] = null;
    }

    public void exibirTarefas() {
        for (Tarefa tarefas : tarefas) {
            tarefas.exibirTarefa();
        }
    }
}
