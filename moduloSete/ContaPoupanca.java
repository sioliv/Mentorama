package moduloSete;

public class ContaPoupanca extends Conta {

  private int diaAniversario;
  private double taxaDeJuros;


  public ContaPoupanca(int numeroConta, String banco, int agencia, double saldo,
      int diaAniversario) {
    super(numeroConta, banco, agencia, saldo);

    this.diaAniversario = diaAniversario;
  }

  @Override
  public double getSaldo() {
    if (diaAniversario >= 1 && diaAniversario <= 10) {
      double juros = ((saldo / 100) + 0.01);
      saldo = saldo + juros;
    } else if (diaAniversario >= 11 && diaAniversario <= 20) {
      double juros = ((saldo / 100) + 0.50);
      saldo = saldo + juros;
    } else if (diaAniversario >= 21 && diaAniversario <= 30) {
      double juros = ((saldo / 100) + 1.00);
      saldo = saldo + juros;
    }
    return super.saldo;
  }

  @Override
  public void depositar(double quantiaDepositoContaPoupanca) {
    saldo = saldo + quantiaDepositoContaPoupanca;
    System.out.println("Valor depositado: " + quantiaDepositoContaPoupanca);
    System.out.println("O novo saldo será de: " + saldo);
  }

  @Override
  public void sacar(double valorSacadoContaPoupanca) {
    //limitando o número de saque se o saldo for maior do que o valor sacado
    if (saldo >= valorSacadoContaPoupanca) {
      saldo = saldo - valorSacadoContaPoupanca;
      System.out.println("Valor sacado: " + valorSacadoContaPoupanca);
      System.out.println("O novo saldo será de: " + saldo);
    }
    if (saldo < valorSacadoContaPoupanca) {
      System.out.println("Saldo insuficiente");
    }
  }

}
