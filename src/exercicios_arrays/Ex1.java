package exercicios_arrays;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] notas = new double[5];
		double soma = 0;
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota: ");
			notas[i] = sc.nextInt();
			soma += notas[i];
		}
		
		
		System.out.println("Notas: ");
		for(int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		System.out.println("Média da turma: " + soma/notas.length);
		
		
		sc.close();
	}

}
