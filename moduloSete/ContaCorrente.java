package moduloSete;

public class ContaCorrente extends Conta {

  private double chequeEspecial;

  @Override
  public String toString() {
    return "ContaCorrente{" +
        "chequeEspecial=" + chequeEspecial +
        '}';
  }

  public ContaCorrente(int numeroConta, String banco, int agencia, double saldo, double sacar,
      double depositar) {
    super(numeroConta, banco, agencia, saldo);// chama o método da classe pai (superclasse)
    this.chequeEspecial = chequeEspecial;
  }

  public double getSaldo() {
    {
      if (saldo >= 10.00 && saldo <= 20.00) {
        chequeEspecial = 100;
        System.out.println("Saldo disponível: " + saldo);
        System.out.println("Cheque especial disponível: " + chequeEspecial);
      } else if (saldo > 20.00) {
        chequeEspecial = 200;
        System.out.println("Saldo disponível: " + saldo);
        System.out.println("Cheque especial disponível: " + chequeEspecial);

      }
    }
    return super.saldo + chequeEspecial;
  }

  @Override
  public void depositar(double quantiaDeposito) {
    saldo = saldo + quantiaDeposito;
    System.out.println("Valor depositado: " + quantiaDeposito);
    System.out.println("O novo saldo será de: " + saldo);
  }

  @Override
  public void sacar(double valorSaque) {
    if (valorSaque > saldo) {
      System.out.println("Saldo Insuficiente. Não será possivel realizar o saque");
    } else if (saldo >= valorSaque) {
      saldo = saldo - valorSaque;
      System.out.println("Valor sacado: " + valorSaque);
      System.out.println("O novo saldo será de: " + saldo);
    }

  }

}
