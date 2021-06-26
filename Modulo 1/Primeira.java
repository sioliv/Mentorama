import java.util.Scanner;

class Primeira{
    public static void main(String[] args) {
        System.out.println("JAVA");//comando de saida

        Scanner entrada= new Scanner(System.in);
        System.out.println("Oi, qual és o seu nome?");
        String s= entrada.next(); //pegando a entrada de dados do usuário
        // o que eu escrver na tela vai entrar dentro da variável s
        //irei utilizar essa variável para devolver a entrada para o usuário

        System.out.println("Hi " + s + ", How r u?");
        //concatenação de partes.
        //concatenacao de strings, juntou o oi, o que vier no s, mas a frase tudo bem.
        
        
    }

}


//a palavra primeira está com o nome do arquivo.
//o nome da classe deve ser igual ao nome do arquivo. Se eu escrever classe com c maiusculo e classe com c minusculo serao duas coisas diferentes
// main, apertando o tab, ele já completa o código.
//temos a palavra run, no qual o sistema estiver todo certinho, o código rodará
//o conceito run e debug serao tratados mais a frente.


//aula 6, incrementar a classe primeira
//vamos perguntar a informação ao usuário e devolver 
//a informação ao usuário, na tela.
// 
//
//
// comando de entrada:
/* usaremos a uma classe que não  faz parte do padrão do java
ela é uma classe utilitária chamada Scanner.
percebe que quando digito, aparece algumas opcoes, incluindo o java.util
O java.util é uma biblioteca, pacote de classes utilitárias.
a variavel de entrada sevirá como uma entrada de dados

ao apertar o tab no scanner, ele importa o pacote para a nossa classe*/