package exercicio1mod10;

import java.util.Scanner;

public class exercicio3mod10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero= -1;
		int soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while(numero != 0) {
			System.out.print("Digite um numero");
			numero = leia.nextInt();
			
			if(numero % 2 == 0 ) {
				soma = soma + numero;
			}
		}
		
		System.out.println("\nA soma dos numeros positivos é: " + soma);
        
        leia.close();

	}

}
