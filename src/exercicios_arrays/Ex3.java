package exercicios_arrays;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] nomes = new String[8];
		boolean achouNome = false;
		int index = 0;
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.println("Digite o nome: ");
			nomes[i] = sc.nextLine();
		}
		
		System.out.println("Informe o nome que deseja procurar: ");
		String nome = sc.nextLine();
		
		for(int i = 0; i < nomes.length; i++) {
			if(nomes[i].equalsIgnoreCase(nome)) {
				achouNome = true;
				index = i;
			}
		}
		
		if(achouNome) {
			System.out.println("Nome encontrado na posição " + index);
		} else {
			System.out.println("Aluno não encontrado!");
		}
		
		sc.close();
	}

}
