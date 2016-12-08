package programa.pe;

import java.util.Scanner;

public class Problema_01 {
	
	static int vec[] = new int[100];
	static int canti;
	static int vecAux[] = new int[100];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese numero");
		Scanner sc = new Scanner(System.in); int num = sc.nextInt();
		
		String cad = String.valueOf(num);  canti = cad.length(); 
		
		createVec(num); invertirVec();
		
		

		
		System.out.println();
		System.out.println("RESPUESTA : "+(vecToNum()+10));
		
		
		
		

	}
	
	public static void createVec(int num){
		
		int cont = 0, indicePot = canti; 
		
		while(cont<canti){
			
		vec[cont] = (int) (num / Math.pow(10, indicePot-1));
		
		num = num % (int) Math.pow(10, indicePot-1);
		
		cont++; indicePot--;
			
		}						
		
	}
	
	public static void invertirVec(){
		int indice = 0;
		for(int i = canti-1;i>=0;i--){
			vecAux[indice] = vec[i];
			indice++;
		}
		
	}

	public static int vecToNum(){
		
		String cade="";
		
		for(int i =0;i<canti;i++){
			cade += ""+vecAux[i]; 
			//System.out.print(vecAux[i]); 
			
			
		}
		
		int aux = Integer.parseInt(cade);
		return aux;
	}
}
