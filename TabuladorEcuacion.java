package programa.pe;

public class TabuladorEcuacion {
	
	public static double nume = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do{
			
			
			
			System.out.println(nume+ " | " +numTabulador(nume));
			
			nume = nume + 0.25;
			
		}while(nume<=10);
		
		


	}
	
	public static double numTabulador(double x){
		
		double res = (Math.pow(x,3)+3*x+1)/(Math.pow(x,2)+2);
		
		return res;
	}
}
	



