package exercicios_arrays;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[15];
		int pares = 0;
		int impares = 0;
		int maioresDez = 0;
		int menoresDez = 0;
		
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o número: ");
			numeros[i] = sc.nextInt();
			
			if(numeros[i] > 0) {
				if(numeros[i] % 2 == 0) {
					pares++;
				} else {
					impares++;
				}
			}
			
			if(numeros[i] > 10) {
				maioresDez++;
			} else {
				menoresDez++;
			}
		}
		
		
		System.out.println("Pares: " + pares);
		System.out.println("Ímpares: " + impares);
		System.out.println("Maiores que 10: " + maioresDez);
		System.out.println("Menores que 10: " + menoresDez);
		
		sc.close();
	}

}
