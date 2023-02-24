import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        // 8. Desenvolva o algoritmo para calcular o resultado de uma eleição de um municipal.
        // A entrada de dados será:
        //      ● Número total de eleitores;
        //      ● Número de votos válidos;
        //      ● Número de votos brancos;
        //      ● Número de votos nulos.
        // O algoritmo deve calcular e exibir para o usuário as seguintes informações (em
        // relação ao total de eleitores):
        //      ● Percentual de votos válidos;
        //      ● Percentual de votos brancos;
        //      ● Percentual de votos nulos
        
        Scanner in = new Scanner(System.in);

        int totalEleitores, votosValidos, votosBrancos, votosNulos;
        float percentValidos, percentBrancos, percentNulos;

        System.out.println("Informe a quantidade de eleitores:");
        totalEleitores = in.nextInt();
        System.out.println("Informe a quantidade de votos válidos:");
        votosValidos = in.nextInt();
        System.out.println("Informe a quantidade de votos em branco:");
        votosBrancos = in.nextInt();
        System.out.println("Informe a quantidade de votos nulos:");
        votosNulos = in.nextInt();

        percentValidos = (votosValidos*100)/totalEleitores;
        percentBrancos = (votosBrancos*100)/totalEleitores;
        percentNulos = (votosNulos*100)/totalEleitores;

        System.out.println("O resultado das eleições foi...");
        System.out.println("Total de votos: "+totalEleitores);

        System.out.println("Votos válidos("+(votosValidos)+"): "+percentValidos+"%");
        System.out.println("Votos brancos("+(votosBrancos)+"): "+ percentBrancos+"%");
        System.out.println("Votos nulos("+(votosNulos)+"): "+ percentNulos+"%");
    }
}