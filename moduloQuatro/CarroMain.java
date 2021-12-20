package moduloQuatro;

public class CarroMain {

    //Verificando se os objetos estão consistentes (Funcionando de acordo com a regra de negócio)
    
    public static void main(String[] args) {

        //Construindo o objeto através da palavra chave NEW


        Carro carro = new Carro(4, "VM12345", 2021, "Gasolina");
    
        carro.setCor(Carro.CINZA);
        carro.setQuantidadeCalotas(4);
        carro.setQuantidadePneus(4);
        carro.setQuantidadeParafusosPneu(0);
        carro.setarCondicionado(true);
        carro.imprimeValores();
        






    }
}


