// Como toda aplicação Java precisa obrigatoriamente estar dentro de um pacote
// principalmente por organização de arquivos, criamos um pacote aqui
package br.com;

public class Principal {
//    Este é o método main, que seria para o dar o ponto de partida para a aplicação
//    Toda aplicação precisa ser inicializada de algum lugar,
//    e através deste método Main, é onde a aplicação Java se inicia
    public static void main(String[] args) {
//      Em Java para se declarar uma variável, você define o tipo antes dela:
//      tipo NomeDaVariavel = valor;
        String nome = "codenation";
//      Esta seria a maneira de imprimir alguma mensagem no console,
//      fazendo uma analogia, seria como o 'console.log' do JavaScript
        System.out.println("Hello " + nome);
    }
}
