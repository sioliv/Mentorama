import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;



public class TarefaModuloDois {
    //treinamento com decisão
    //loop
    //condicional de forma estruturada ou nao

    //calculo de imc

    public static void main(String[] args) {

        double altura, peso, imc;
        String opc;

        //formatando casas decimais

        DecimalFormat formatador = new DecimalFormat("#0.00");
        
        Scanner entrada = new Scanner(System.in);
        Scanner entrada_opc = new Scanner(System.in);

        

        do{
            System.out.println("Digite a sua altura: ");

            altura = entrada.nextDouble();

            System.out.println("Digite o seu peso: ");

            peso = entrada.nextDouble();

        //Calculo imc, processamento

            imc = (peso / (altura * altura));
            System.out.println("O imc é: " + formatador.format(imc));

        //classificando através de estrutura encadeada

            if(imc < 18.5 ){

                System.out.println("Você está abaixo do peso");

            } else if(imc <24.9){

                System.out.println("Peso ideal!!!");

            } else if(imc < 29.9){

                System.out.println("Sobrepeso");
            } else if(imc < 34.9){

                System.out.println("Obesidade Grau I");

            } else if(imc <39.9){
            
                System.out.println("Obesidade Grau II");
            }else{
                System.out.println("Obesidade Grau III ou Mórbida");
            }

            System.out.println("Deseja continuar? Digite S para sim ou N para não");
            opc = entrada_opc.nextLine();
    



        }while(opc.equals("s") || opc.equals("S"));
        System.out.println("Você saiu do programa");
        
        


        
    }




}
