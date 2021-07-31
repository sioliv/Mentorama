package moduloCinco;



public class Wrappers {

		
		//Quatro classes wrappers que representam o tipo primitivo inteiro
		Short numeroCurto = new Short((short)1);
		Byte valor  = new Byte((byte)11);
		Integer numeroInteiro = new Integer(10);
		Long numeroLong = new Long((long)10000000);
		Long numero2Long = new Long(100000l);
		
		//Wrappers que representam o ponto flutuante
		
		Float numeroPontoFlutuantePrecisaoMenor = new Float(3.5f);
		Double numeroDoublePrecisaoMaior = new Double(3.55555555555556);
		
	
		//Wrappers que representam boolean
		Boolean flag = new Boolean(false);
		Boolean flag2 = new Boolean(true);
		
		//Wrappers que representam Caracteres
		Character a = new Character('a');
		
       		//Como os construtores estão descontinuados, vou fazer o autoboxing no Integer
        
      		Integer idadeRef = Integer.valueOf(35);
        
        
        


    
    
}
