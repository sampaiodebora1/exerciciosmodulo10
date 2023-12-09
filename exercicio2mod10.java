package exercicio1mod10;

import java.util.Scanner;
public class exercicio2mod10 {

	public static void main(String[] args) {
		
		int idade = 0;
		int menoresde21 = 0;
		int maioresde50 = 0;
		
		
		Scanner leia = new Scanner(System.in);
		
		while(idade >=0) {
			System.out.print("Digite uma idade");
			idade = leia.nextInt();
			
			if(idade <21 ) {
				menoresde21++;
			}else
			if(idade > 50 ) {
				maioresde50++;
			}
		}
		
		System.out.println("\nTotal de pessoas menores que 21 anos: " + menoresde21);
        System.out.println("\nTotal de pessoas maiores que 50 anos: " + maioresde50);

        leia.close();
	}

}
