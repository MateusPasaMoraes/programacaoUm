package exercicios_arrays;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		int maiorNum = 0;
		int posMaior = 0;
		int posMenor = 0;
		int menorNum = 99999;
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("Informe um número: ");
			num[i] = sc.nextInt();
			
			if(num[i] > maiorNum) {
				maiorNum = num[i];
				posMaior = i;
			}
			
			if(num[i] < menorNum) {
				menorNum = num[i];
				posMenor = i;
			}
			
		}
		
		
		System.out.println("Números: ");
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("Maior número: " + maiorNum);
		System.out.println("Posição maior número: " + posMaior);
		System.out.println("Menor número: " + menorNum);
		System.out.println("Posição menor número: " + posMenor);
		
		
		sc.close();
	}

}
