package exercicios_arrays_multidimencionais;

import java.util.Scanner;

public class Ex5MatrizForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] notas = new double[5][4];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas do Aluno " + (i + 1) + ":");

            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Avaliação " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        double somaTurma = 0;
        double maiorMedia = 0;
        double menorMedia = 0;
        int alunoMaior = 0;
        int alunoMenor = 0;
        int aprovados = 0;
        int numeroAluno = 0;

        System.out.println("\nNotas:");


        for (double[] aluno : notas) {
            numeroAluno++;
            double somaAluno = 0;

            System.out.print("Aluno " + numeroAluno + ": ");

            for (double nota : aluno) {
                System.out.print(nota + " ");
                somaAluno += nota;
            }

            double media = somaAluno / aluno.length;
            somaTurma += somaAluno;

            if (numeroAluno == 1) {
                maiorMedia = media;
                menorMedia = media;
                alunoMaior = numeroAluno;
                alunoMenor = numeroAluno;
            } else {
                if (media > maiorMedia) {
                    maiorMedia = media;
                    alunoMaior = numeroAluno;
                }

                if (media < menorMedia) {
                    menorMedia = media;
                    alunoMenor = numeroAluno;
                }
            }

            if (media >= 7.0) {
                aprovados++;
            }

            System.out.println("- Média: " + media);
        }

        double mediaTurma = somaTurma / (notas.length * notas[0].length);

        System.out.println("\nMaior média: Aluno " + alunoMaior + " - " + maiorMedia);
        System.out.println("Menor média: Aluno " + alunoMenor + " - " + menorMedia);
        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Alunos aprovados: " + aprovados);

        sc.close();
    }
}
