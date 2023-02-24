import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        // 6. Desenvolva o algoritmo de um programa para calcular a média de duas notas das
        // avaliações de um aluno.

        float nota1, nota2, media;

        Scanner in = new Scanner(System.in);
        System.out.println("Informe a nota 1: ");
        nota1 = in.nextFloat();

        System.out.println("Informe a nota 2: ");
        nota2 = in.nextFloat();

        media = (nota1+nota2)/2;

        System.out.printf("A media é: " + media);
    }
}