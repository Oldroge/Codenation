package br.com.todo_list;

public class Tarefa {
    String descricao;

//   Construtor: O construtor em Java é definido como um método, cujo o nome deve ser
//    o mesmo nome da classe.
//    Sem indicação do tipo de retorno, nem  mesmo o void, sendo invocado no momento da criação
//    do objeto utilizando a palavra reservada new.
    public Tarefa(String desc) {
//      A palavra reservada 'this' é para informar ao compilador que a variável utilizada
//      está dentro da classe, não especificamente dentro do construtor.
        this.descricao = desc;
    }

//  A palavra reservada void, é para informar ao compilador que o método não possui retorno.
    void exibirTarefa(){
        System.out.println(descricao);
    }
    public int obterTamanhoDaTarefa() {
        return descricao.length();
    }

}
