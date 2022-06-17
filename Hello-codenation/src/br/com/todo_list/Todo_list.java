package br.com.todo_list;

public class Todo_list {

    public static void main(String[] args) {
        System.out.println("Minhas tarefas");
        System.out.println("===============");

//      para isntanciar os métodos de uma classe:
//      nomeDaClasse nomeDaVariável = new nomeDaClasse("valor");

        ListaTarefas listaDeTarefas = new ListaTarefas();

//      A palavra reservada new é utilizada cada vez que for instanciada
//      um novo objeto/método

        listaDeTarefas.adicionarTarefa("Estudar java");
        listaDeTarefas.adicionarTarefa("Limpar a casa");
        listaDeTarefas.adicionarTarefa("Fazer jantar");
        listaDeTarefas.adicionarTarefa("Fazer alguma coisa");

        listaDeTarefas.removerTarefa(0);

        listaDeTarefas.exibirTarefas();

        System.out.println("Buscando tarefa...");
        Tarefa tarefas = listaDeTarefas.buscarTarefa("Fazer alguma coisa");
        tarefas.exibirTarefa();



    }




}
