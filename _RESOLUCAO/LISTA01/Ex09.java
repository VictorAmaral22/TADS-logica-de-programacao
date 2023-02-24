import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        // 9. Considere que você deseja uma comemoração especial para o seu aniversário e
        // assim irá convidar familiares a amigos para um churrasco na sua residência. Você
        // irá precisar comprar a carne a ser consumida pelos seus convidados, logo precisa
        // de uma forma de calcular a quantidade certa a ser adquirida.

        // Desenvolva o algoritmo do programa para auxiliar no cálculo da quantidade de carne
        // bovina (sem osso) a ser comprada considerando que homens, mulheres e crianças
        // consomem uma quantidades diferentes de carne.

        // Consumo de carne médio
        //      Homens: 400 gramas
        //      Mulheres: 320 gramas
        //      Crianças: 200 gramas

        // *Observação: geralmente é adicionada uma margem de segurança na quantidade
        // de carne a ser comprada para evitar que falte. Adicione uma margem de segurança
        // de 20% no total de carne a ser adquirida

        Scanner in = new Scanner(System.in);

        int qtdHomens, qtdMulheres, qtdCriancas;
        float qtdCarne, medHomem, medMulher, medCrianca;

        medHomem = 400;
        medMulher = 320;
        medCrianca = 200;

        final float MARGEM_SEG = (float) 0.2;

        System.out.println("Informe a quantidade de homens:");
        qtdHomens = in.nextInt();
        System.out.println("Informe a quantidade de mulheres:");
        qtdMulheres = in.nextInt();
        System.out.println("Informe a quantidade de crianças:");
        qtdCriancas = in.nextInt();

        qtdCarne = (medHomem*qtdHomens) + (medMulher*qtdMulheres) + (medCrianca* qtdCriancas);
        qtdCarne = qtdCarne * (1 + MARGEM_SEG);

        System.out.println("Para o churrascão, você precisará comprar "+ qtdCarne+"g de carne bovina, com uma marge de segurança de "+(MARGEM_SEG*100)+"% ...");
    }
}