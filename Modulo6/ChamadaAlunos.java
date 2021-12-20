package Modulo6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ChamadaAlunos {

  public static Alunos alunos = new Alunos();

  public static void main(String[] args) throws Exception {

    System.out.println("----DIÁRIO DE CLASSE----");
    int opcao;

    do {
      System.out.println("1 - Acesso ao diário de classe");
      System.out.println("2 - Verificar a presença do aluno");
      System.out.println("0 - Sair");

      Scanner entrada = new Scanner(System.in);
      opcao = entrada.nextInt();
      process(opcao);

    } while (opcao != 0);
  }

  public static void process(int opcao) throws Exception {

    switch (opcao) {
      case 1: {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a data da chamada");
        String dataString = scanner.next();
        Date dataChamada = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);

        System.out.println("Digite o nome do aluno");
        String aluno = scanner.next();

        System.out.println("O aluno esta presente?");
        String presente = scanner.next();

        Diario novoDiario = new Diario(dataChamada, aluno, presente);
        alunos.addNovoAluno(novoDiario);

        break;
      }
      case 2: {
        List<Diario> listaDiario = alunos.getDiarioList();
        for(Diario diario : listaDiario){

          System.out.println("Chamada feita com sucesso:");
          System.out.println("--- Data Chamada: " + diario.getDataChamada());
          System.out.println("--- Nome Do Aluno: " + diario.getAluno());
          System.out.println("--- Aluno(a) está presente? " + diario.getPresente());
          System.out.println("-----------------------------------------------------");
        }
        break;

        }

      }
    }
  }
