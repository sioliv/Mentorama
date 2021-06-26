import java.util.Scanner;
import java.lang.System;


public class Menu {

   

//Criando o programa principal
    public static void main(String[ ]args){
        int opcao = 0;
    


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

        
//Chavear. chaveia a variável opção. Caso ele digite 1, mostrará a opção.
//O break  é obrigatório, pois termina o case e pula para o final do bloco.
        switch(opcao) {
        case 1:
            System.out.println("Opção 1 selecionada");
        break;

        case 2:
            System.out.println("Opcao 2 selecionada:");
            break;
        
        case 3:
            System.out.println("Programa finalizado! ");
            break;

        default:
            System.out.println("Seleção inválida");
            break;
            
        }

       

        }
        

    }

}   
    

