import java.util.Scanner;

public class teste {

       public static void main(String[] args) {
           Scanner sele = new Scanner (System.in);
           //boolean escolhido = true;
           int opc;
           do
           {
               //SELEÇÃO DOS MÓDULOS
               System.out.println("ESCOLHA O SETOR DESEJADO:");
               System.out.println("1- Financeiro");
               System.out.println("2- Contas");
               System.out.println("3-RH");
               System.out.println("4- DO");
               System.out.println("5- TI");
               System.out.println("6- Sair ");
               opc = sele.nextInt();
               
               if (opc == 1)
               {
                   System.out.println("FINANCEIRO");
                  
               }else if(opc == 2){
                    System.out.println("Contas");
               }else if (opc == 3){
                    System.out.println("RH");
               }else if(opc == 4){
                    System.out.println("DO");
               }else if(opc == 5){
                    System.out.println("FINANCEIRO");
               }

           }while(opc != 6);
           System.out.println("Sair");
    }
    
}

