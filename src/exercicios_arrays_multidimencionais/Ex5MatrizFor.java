package exercicios_arrays_multidimencionais;

import java.util.Scanner;

public class Ex5MatrizFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] notas = new double[5][4];
        double[] medias = new double[5];
        double somaTurma = 0;
        double maiorMedia = 0;
        double menorMedia = 0;
        int alunoMaior = 0;
        int alunoMenor = 0;
        int aprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas do Aluno " + (i + 1) + ":");

            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Avaliação " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\nNotas:");

        for (int i = 0; i < notas.length; i++) {
            double somaAluno = 0;

            System.out.print("Aluno " + (i + 1) + ": ");

            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
                somaAluno += notas[i][j];
            }

            medias[i] = somaAluno / notas[i].length;
            somaTurma += somaAluno;

            if (i == 0) {
                maiorMedia = medias[i];
                menorMedia = medias[i];
                alunoMaior = i + 1;
                alunoMenor = i + 1;
            } else {
                if (medias[i] > maiorMedia) {
                    maiorMedia = medias[i];
                    alunoMaior = i + 1;
                }

                if (medias[i] < menorMedia) {
                    menorMedia = medias[i];
                    alunoMenor = i + 1;
                }
            }

            if (medias[i] >= 7.0) {
                aprovados++;
            }

            System.out.println("- Média: " + medias[i]);
        }

        double mediaTurma = somaTurma / (notas.length * notas[0].length);

        System.out.println("\nMaior média: Aluno " + alunoMaior + " - " + maiorMedia);
        System.out.println("Menor média: Aluno " + alunoMenor + " - " + menorMedia);
        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Alunos aprovados: " + aprovados);

        sc.close();
    }
}
