package exercicios_arrays;

import java.util.Scanner;

public class Ex5ForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] valores = new double[10];
        double soma = 0;
        double maior = 0;
        double menor = 0;


        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o valor: ");
            valores[i] = sc.nextDouble();
        }

        for (double valor : valores) {
            soma += valor;

            if (valor > maior || maior == 0) {
                maior = valor;
            }

            if (valor < menor || menor == 0) {
                menor = valor;
            }
        }

        double media = soma / valores.length;
        int acimaMedia = 0;

        for (double valor : valores) {
            if (valor > media) {
                acimaMedia++;
            }
        }

        System.out.println("\nTodos os valores:");
        for (double valor : valores) {
            System.out.print(valor + " ");
        }

        System.out.println("\nSoma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Valores acima da média: " + acimaMedia);

        sc.close();
    }
}
