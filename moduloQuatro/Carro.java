    package moduloQuatro;

    public class Carro{


        Integer numeroPortas;
        String numeroChassi;
        Integer anoFabricacao;
        String combustivel;
        boolean arCondicionado;


        //Declaração de constantes

        public static final String VERMELHO = "vermelho";
        public static final String PRETO = "preto";
        public static final String CINZA = "cinza";


        //Regra de negócio obrigatória

        public Carro(Integer numeroPortas, String numeroChassi, Integer anoFabricacao, String combustivel){
            this.numeroPortas = numeroPortas;
            this.numeroChassi = numeroChassi;
            this.anoFabricacao = anoFabricacao;
            this.combustivel = combustivel;
        }

        //Regra de negócio opcional

        private String cor;


        public void setCor(String cor){
            this.cor = cor;


        }

        public String getCor(){
            return cor;

        }

        private Integer quantidadePneus;

        public void setQuantidadePneus(Integer quantidadePneus){
            this.quantidadePneus = quantidadePneus;
            quantidadePneus = quantidadePneus +2;

        }


        public Integer getQuantidadePneus(){
            return quantidadePneus;
        }

        private Integer quantidadeCalotas;
        public void setQuantidadeCalotas(Integer quantidadePneus){
            this.quantidadeCalotas = quantidadePneus;

        }


        public Integer getQuantidadeCalotas(){
            return quantidadeCalotas;
        }

        private Integer quantidadeParafusosPneu;
        public Integer getQuantidadeParafusosPneu(){
            return quantidadeParafusosPneu;
        }

        public void setQuantidadeParafusosPneu(Integer quantidadeParafusosPneu){
            this.quantidadeParafusosPneu = quantidadePneus ;
            quantidadeParafusosPneu = quantidadePneus* 4;

        }

        public boolean setarCondicionado(boolean arCondicionado) {
            this.arCondicionado = arCondicionado;
            return arCondicionado;
        }

        private boolean getarCondicionado(){
            return arCondicionado;
        }

        public void imprimeValores(){
            System.out.println("Cor do carro: " + cor);
            System.out.println("Numero de Portas: "     +numeroPortas);
            System.out.println("Numero de Chassi: "     +numeroChassi);
            System.out.println("Ano de fabricação: "    +anoFabricacao);
            System.out.println("Tipo Combustivel: "     +combustivel);


            System.out.println("Quantidade Calotas:  "    +quantidadeCalotas );
            System.out.println("Quantidade Pneus: " +quantidadePneus);
            System.out.println("Quantidade de parafusos Pneu: " +quantidadeParafusosPneu);

            System.out.println("O Carro Possui Ar Condicionado: " +arCondicionado);


        }



    }


