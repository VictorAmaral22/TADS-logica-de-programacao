import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        // 2. O algoritmo deve ter como entrada um número real e a saída deve ser o valor
        // atualizado com os 20%.

        float emprestimo, valorRetorno;
        final float TAXA = (float) 0.2;

        Scanner in = new Scanner(System.in);
        System.out.println("Informe o valor do empréstimo: ");
        emprestimo = in.nextFloat();

        valorRetorno = emprestimo * (1 + TAXA);

        System.out.printf("O valor a ser retornado, com %f de taxa, é: %f", (TAXA*100), valorRetorno);
    }
}