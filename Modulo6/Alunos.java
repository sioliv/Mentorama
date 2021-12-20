package Modulo6;

import java.util.ArrayList;
import java.util.List;

public class Alunos {

  private List<Diario> diarioList = new ArrayList<>();

  public List<Diario> getDiarioList(){
    return diarioList;
  }

  public void addNovoAluno(Diario diario){
    diarioList.add(diario);
  }





}
