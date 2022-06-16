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
        Tarefa tarefa1 = new Tarefa("Estudar java");
        Tarefa tarefa2 = new Tarefa("Limpar a casa");
        Tarefa tarefa3 = new Tarefa("Fazer jantar");
        Tarefa tarefa4 = new Tarefa("Fazer alguma coisa");

        listaDeTarefas.adicionarTarefa(tarefa1);
        listaDeTarefas.adicionarTarefa(tarefa2);
        listaDeTarefas.adicionarTarefa(tarefa3);
        listaDeTarefas.adicionarTarefa(tarefa4);

        listaDeTarefas.exibirTarefas();

        System.out.println("A tarefa '" + tarefa1.descricao +  "' tem " + tarefa1.obterTamanhoDaTarefa() + " caracteres");


    }




}
