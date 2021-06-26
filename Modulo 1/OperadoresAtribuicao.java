import java.io.IOException;


public class OperadoresAtribuicao {


    public static void main(String[] args) throws IOException{
   
    /* Atribuição:
   Aribuo um valor aquela variavel.
   Com a variável atribuida, posso fazer inúmeros tipos de operações:*/


   //valor 1 atribuido a variavel 
   int valor = 1;
   valor = valor + 2;
   System.out.println(valor);
   valor = valor - 1;
   System.out.println(valor);
   valor = valor * 2;
   System.out.println(valor);
   valor = valor / 2;
   System.out.println(valor);
   valor = valor % 2;
   System.out.println(valor);

    for (int contador = 0; contador <100; contador ++) {

        System.out.println("E ai truta?!");
    }   

    int contador = 0;
    while(contador <100){
        System.out.println("testando");
        contador ++;
    }

    }

   
}
