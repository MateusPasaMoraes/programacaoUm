package exercicios_arrays;

import java.util.Scanner;

public class Ex5For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] valores = new double[10];
        double soma = 0;
        double maior = 0;
        double menor = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o valor: ");
            valores[i] = sc.nextDouble();
            soma += valores[i];

            if (i == 0) {
                maior = valores[i];
                menor = valores[i];
            } else {
                if (valores[i] > maior) {
                    maior = valores[i];
                }
                
                if (valores[i] < menor) {
                    menor = valores[i];
                }
            }
        }

        double media = soma / valores.length;
        int acimaMedia = 0;

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > media) {
                acimaMedia++;
            }
        }

        System.out.println("\nTodos os valores:");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }

        System.out.println("\nSoma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Valores acima da média: " + acimaMedia);

        sc.close();
    }
}
