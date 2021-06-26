import java.util.Scanner;



public class TarefaDois {

   

//Criando o programa principal
    public static void main(String[ ]args){
        int opcao = 0;
    

//repetição
        while(opcao !=3){

        System.out.println("|   MENU            |");
        System.out.println("|   Opções:         |");
        System.out.println("|       1. Opção 1  |");
        System.out.println("|       2. Opção 2  |");
        System.out.println("|       3. Sair     |");

//Criei a variável menu, da classe scanner, responsavel por obter alguma informação do usuário
        Scanner menu = new Scanner(System.in);
    

        System.out.println("Selecione uma opção: ");
        opcao = menu.nextInt();

//Condicional
        if (opcao==1) {

            System.out.println("Opção 1 selecionada");

        }else  if(opcao ==2){

            System.out.println("Opcão 2 selecionada");

        }else if(opcao == 3){

            System.out.println("Programa finalizado! ");

        }else{
            
            System.out.println("Seleção inválida");

        }

        
            
           
            
        }

    }

}

