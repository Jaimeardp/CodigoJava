package programa.pe;

import java.util.Scanner;

public class Problema_02 {
	
	
	static int vec[] = new int[100]; // Vector donde acumulara cada digito del numero
	static int canti;  // Cantida de digitos del numero

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese numero");
		Scanner sc = new Scanner(System.in); int num = sc.nextInt();
		
		String cad = String.valueOf(num); canti = cad.length(); 
				
		createVec(num);
				
		if(izder() == true){System.out.println("Son consecutivos de izquierda a derecha");}
		else{
			if(deriz() == true){System.out.println("Son consecutivos de derecha a izquierda");}
			else{System.out.println("No son consecutivos");}
		}
}
	
	private static boolean deriz() {
		boolean rec = true;
		
		for(int j=canti-1;j>0;j--){  
			
			if(vec[j] == vec[j-1]-1){ 
				rec = true;
			  }else{rec = false; break;}
			} return rec;
		
	}

	public static boolean izder(){
		boolean rec = true;
		
		for(int j=0;j<canti-1;j++){  //2347
					
			if(vec[j] == vec[j+1]-1){ // 123
				rec = true;
				}else{rec = false; break;}
			}return rec;
	}
	
	public static void createVec(int num){
		
		int cont = 0, indicePot = canti;
		
		while(cont<canti){
			
		vec[cont] = (int) (num / Math.pow(10, indicePot-1));
		
		num = num % (int) Math.pow(10, indicePot-1);
		
		cont++; indicePot--;
			
		}
		
		
	}

}
