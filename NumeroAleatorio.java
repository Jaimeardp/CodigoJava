package programa.pe;

public class NumeroAleatorio {
	
	 
	 static int cont = 0;
	
	public static void main(String[] args) {
	
		int numeroAleatorio; 
	
	
		do{
			
			numeroAleatorio = (int) (Math.random()*1000+1);
			cont = 0;
			
			
			numDivisores(numeroAleatorio);
			
			System.out.println(""+numeroAleatorio+" | "+cont);
			
			if(cont == 4){break;}
			
		
			
		}while(true);
	}
	
	public static void numDivisores(int numeroAleatorio){
		
		for(int i=1;i<=numeroAleatorio;i++){
			
			if(numeroAleatorio % i == 0){
				cont++;
			} 
		
		
		}
		
	}

}
