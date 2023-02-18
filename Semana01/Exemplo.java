import java.lang.reflect.Array;
import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args){
        // int a = 102504;
        // int b = 96321;
        // int resultado = a + b;
        // String nome = "Vitão da massa";
        // Boolean ehusguri = false;

        System.out.println("Funciona!!!");
        // System.out.println("resultado "+resultado);

        int largura, comprimento, area;

        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Insira a largura: ");
        largura = in.nextInt();
        System.out.println("Insira o comprimento: ");
        comprimento = in.nextInt();

        area = largura*comprimento;
        System.out.println("A sala tem "+area+"m²");
    }
}
