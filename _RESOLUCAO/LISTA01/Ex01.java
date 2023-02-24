import java.util.Scanner;

public class Ex01 {
    public static void main (String[] args){
        // 1. Desenvolva o algoritmo de um programa onde o usuário irá informar um número
        // inteiro e o programa deve calcular e exibir o número imediatamente antecessor ao
        // número digitado pelo usuário.

        int numero, resultado;
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um número: ");
        numero = in.nextInt();

        resultado = numero - 1;

        System.out.println("O resultado é " + resultado);
    }
}