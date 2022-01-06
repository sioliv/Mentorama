package moduloSete;

public class ContaSalario extends Conta{

  private int limiteSaque;

  public ContaSalario(int numeroConta, String banco, int agencia, double saldo, int limiteSaque){
    super(numeroConta, banco, agencia, saldo);
    this.limiteSaque = limiteSaque;

  }

  @Override
  public double getSaldo(){
    return super.saldo;
  }

  @Override
  public void depositar(double quantiaDeposito){
    saldo =  saldo + quantiaDeposito;
    System.out.println("Valor depositado: " +quantiaDeposito);
    System.out.println("O novo saldo será de: " +saldo);
  }

  @Override
  public void sacar(double valorSacado){
  
  if(saldo >= valorSacado && limiteSaque == 2){
      saldo = saldo - valorSacado;
      System.out.println("Valor sacado: " +valorSacado);
      System.out.println("O novo saldo será de: " +saldo);
    }else if(limiteSaque >= 3){
      System.out.println("Permitido somente 2 saques. Houve uma  " +limiteSaque+ " tentativa de saque, excedendo o limite");
    }
    if(saldo < valorSacado){
      System.out.println("Saldo insuficiente");
    }
  }

}
