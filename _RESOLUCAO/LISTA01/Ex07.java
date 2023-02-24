import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        // 7. Construa um algoritmo que dadas as entradas: distância do trajeto e velocidade
        // média da viagem, informe o tempo que uma família levará saindo de sua cidade de
        // férias até o destino previsto. Após o cálculo, o algoritmo deve mostrar o tempo
        // calculado

        float distancia, velMedia, tempo;

        Scanner in = new Scanner(System.in);
        System.out.println("Informe a distância em metros: ");
        distancia = in.nextFloat();

        System.out.println("Informe a velocidade metros/s: ");
        velMedia = in.nextFloat();

        tempo = distancia / velMedia;

        System.out.printf("Você chegará ao destino em : " + tempo + " segundos, ou "+ (tempo/60) + " minutos");
    }
}