package moduloSete;

public abstract class Conta {

  private int numeroConta;
  private String banco;
  private int agencia;
  protected double saldo;

  public abstract void sacar(double valor);

  public abstract void depositar(double quantiaDeposito);

  public double getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
  }

  public String getBanco() {
    return banco;
  }

  public void setBanco(String banco) {
    this.banco = banco;
  }

  public int getAgencia() {
    return agencia;
  }

  public void setAgencia(int agencia) {
    this.agencia = agencia;
  }

  public abstract double getSaldo();

  public void setSaldo(int Saldo) {
    this.saldo = saldo;
  }

  public Conta(int numeroConta, String banco, int agencia, double saldo) {
    this.numeroConta = numeroConta;
    this.banco = banco;
    this.agencia = agencia;
    this.saldo = saldo;
  }

  public String toString() {
    return "Conta{"
        + "numero = " + numeroConta +
        ", agencia = " + agencia +
        ", banco = " + banco +
        ", saldo = " + saldo + '}';
  }

}
