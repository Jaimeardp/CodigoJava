package programa.pe;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++){
			if(num % i == 0){
				cont++; 
			}
		}
	
		System.out.println(cont);

	}

}
