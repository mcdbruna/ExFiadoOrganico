package Exercicio;

import java.util.Scanner;

public class FiadoOrganico {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do cliente: ");
		
		String nome = scanner.nextLine();
		Consumidor consumidor = new Consumidor(nome);
		
		System.out.print("Informe o numero de telefone: ");
		String telefone = scanner.nextLine();
		Consumidor Consumidor = new Consumidor(telefone);
		
		System.out.print("Infome o valo da compra: ");
		int fiado = Integer.valueOf(scanner.nextInt());
		consumidor.registrarFiado(fiado);
	
		
		int total = consumidor.getFiado();


			if (total >= 100) {
			System.out.println("Cliente " + consumidor.getNome() +  " Deve: " + total + ", Ganhou brinde.");
			
			} else {
			System.out.println("Cliente " + consumidor.getNome() +  " Deve: " + total);

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
