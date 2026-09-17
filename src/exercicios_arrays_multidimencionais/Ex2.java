package exercicios_arrays_multidimencionais;

public class Ex2 {
    public static void main(String[] args) {
        int[][] matriz = {
            {5, 8, 2, 7},
            {3, 9, 4, 1},
            {6, 0, 12, 10},
            {15, 11, 13, 14}
        };

        int soma = 0;
        int maior = matriz[0][0];
        int menor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        double media = (double) soma / (matriz.length * matriz[0].length);

        System.out.println("Matriz:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSoma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);
    }
}
