
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        // 3. Desenvolva o algoritmo de um programa onde o usuário irá informar um número
        // inteiro e o programa deve calcular e exibir quadrado do número informado pelo
        // usuário.

        int numero, potenciacao;

        Scanner in = new Scanner(System.in);
        System.out.println("Informe um número: ");
        numero = in.nextInt();

        potenciacao = numero*numero;

        System.out.printf(numero+"² = "+potenciacao);
    }
}