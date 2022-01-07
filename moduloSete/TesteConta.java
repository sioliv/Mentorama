package moduloSete;

public class TesteConta {

  public static void main(String[] args) {

    ContaCorrente cc1 = new ContaCorrente(22, "Banco AA", 1, 100.00);
    System.out.println(
        "O saldo da conta corrente (incluindo o cheque especial) é de R$: " + cc1.getSaldo());
    cc1.sacar(20.00);
    cc1.depositar(100.00);
    System.out.println(" ");

    ContaSalario cc3 = new ContaSalario(22, "Banco AA", 1, 900.00, 2);
    System.out.println("O saldo na conta salário é: " + cc3.getSaldo());
    cc3.sacar(30.00);
    cc3.depositar(500.00);

    System.out.println(" ");
    ContaPoupanca cc4 = new ContaPoupanca(1, "Banco AA", 1, 1000.00, 30);
    System.out.println("O saldo da conta poupança é R$" + cc4.getSaldo());
    cc4.sacar(100.00);
    cc4.depositar(2000.00);

  }

}
