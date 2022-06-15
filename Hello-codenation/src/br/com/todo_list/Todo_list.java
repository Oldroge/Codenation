package br.com.todo_list;

public class Todo_list {

    public static void main(String[] args) {
        System.out.println("Minhas tarefas");
        System.out.println("===============");

//      para isntanciar os métodos de uma classe:
//      nomeDaClasse nomeDaVariável = new nomeDaClasse("valor");

//      A palavra reservada new é utilizada cada vez que for instanciada
//      um novo objeto/método
        Tarefa tarefa1 = new Tarefa("Estudar java");

        tarefa1.exibirTarefa();

        System.out.println("A tarefa tem: " + tarefa1.obterTamanhoDaTarefa() + " caracteres");


    }




}
