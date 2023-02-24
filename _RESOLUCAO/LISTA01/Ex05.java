
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        // 5. Desenvolva o algoritmo para converter uma temperatura em graus Fahrenheit para
        // graus Celsius.
        // A fórmula para conversão é a seguinte: C/5 = (F-32)/9

        float grausC, grausF;

        Scanner in = new Scanner(System.in);
        System.out.println("Informe a temperatura em Fahrenheit: ");
        grausF = in.nextFloat();

        grausC = ((grausF - 32) * 5) / 9;

        System.out.printf("A temperatura em graus celcius é: "+grausC);
    }
}