package Exercicio;

import java.util.Scanner;

public class FiadoOrganico {

	public static void main(String[] args) {
		
		Consumidor consumidor = new Consumidor();
		consumidor.fiados = new int [10];

		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do cliente: ");
		consumidor.nome = scanner.nextLine();
		System.out.print("Infome o valo da compra: ");
		consumidor.fiados [0] = Integer.valueOf(scanner.nextInt());
	
		
		int total = somawhile(consumidor.fiados);
		
		while (total <=0) {
			System.out.println("Valor invalido!");
			System.out.print("Infome o valo da compra: ");
			consumidor.fiados [0] = Integer.valueOf(scanner.nextInt());
			
			total = somawhile(consumidor.fiados);
		}

			if (total >= 100) {
			System.out.println("Cliente " + consumidor.nome + " Deve: " + total + ", Ganhou brinde.");
			
			} else {
			System.out.println("Cliente " + consumidor.nome + " Deve: " + total);

		}
	
		
		}



	public static int somawhile(int[] fiados) {
		int i = 0;
		int total = 0;
		while (i < fiados.length) {
			total += fiados[i];
			i++;
		}
		return total;
		
	}
	
	
}
