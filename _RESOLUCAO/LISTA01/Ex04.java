
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // 4. Desenvolva um algoritmo para calcular a área de um triângulo. Pensem nas
        // variáveis que serão necessárias. Ao final, o algoritmo deve informar a área total do
        // triângulo.

        int base, altura, area;

        Scanner in = new Scanner(System.in);
        System.out.println("Informe o tamanho da base do triângulo: ");
        base = in.nextInt();

        System.out.println("Informe altura do triângulo: ");
        altura = in.nextInt();

        area = (base*altura)/2;

        System.out.printf("A área do triangulo de base %d e altura %d, é %d", base, altura, area);
    }
}