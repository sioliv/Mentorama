package Modulo6;

import java.util.Date;

public class Diario {
  private String aluno;
  private Date dataChamada;
  private String presente;


  public Diario(Date dataChamada,String aluno, String presente){
    this.aluno = aluno;
    this.dataChamada = dataChamada;
    this.presente = presente;

  }

  public String getAluno(){
    return aluno;
  }

  public Date getDataChamada(){
    return dataChamada;
  }

  public String getPresente(){
    return presente;
  }

}