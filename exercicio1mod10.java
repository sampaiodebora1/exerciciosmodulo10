package exercicio1mod10;

import java.util.Scanner;

public class exercicio1mod10 {

	public static void main(String[] args) {
		
		int numero;
		int numeropar = 0;
		int numeroimpar = 0;
	
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i<=10; i++) {
			System.out.print("Digite o número");
			numero = leia.nextInt();
			
			
			if (numero % 2 == 0) {
	            numeropar++;
	        } else {
	            numeroimpar++;
		    }
	
		    } 
		System.out.println("\nTotal de números pares: " + numeropar);
        System.out.println("\nTotal de números ímpares: " + numeroimpar);
        
        leia.close();
   }
}