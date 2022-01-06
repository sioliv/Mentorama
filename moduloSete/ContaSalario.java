package moduloSete;

//SAlario, já que você tem tudo que um Conta tem
// Classe salario é uma conta. Conta Salario herda da class Conta
public class ContaSalario extends Conta{
  /*
  Além disso, crie uma classe chamada ContaSalário que herda da superclasse e nela haverá uma restrição na qual existe um limite de saques que podem ser feitos. É claro que existem muitas regras de negócios envolvidas numa conta real, mas vamos deixar aqui na nossa tarefa mais simples.
   */
  private int limiteSaque;

  public ContaSalario(int numeroConta, String banco, int agencia, double saldo, int limiteSaque){
    super(numeroConta, banco, agencia, saldo);
    this.limiteSaque = limiteSaque;

  }

  @Override
  public double getSaldo(){
    return super.saldo;// Mostro que o atributo não está definido nessa classe
  }

  //Colocando a regra específica somente da conta salário
  @Override
  public void depositar(double quantiaDeposito){
    saldo =  saldo + quantiaDeposito;
    System.out.println("Valor depositado: " +quantiaDeposito);
    System.out.println("O novo saldo será de: " +saldo);
  }

  @Override
  public void sacar(double valorSacado){
  //limitando o número de saque se o saldo for maior do que o valor sacado
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


/*
regra de negócio, limite de saque por usuário

 */