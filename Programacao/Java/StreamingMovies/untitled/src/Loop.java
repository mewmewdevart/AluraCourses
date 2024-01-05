import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0.0; // Initialize to 0
        double nota;

        System.out.println("Com for");
        for (int i = 0; i < 3; i++) {
            System.out.println("Qual a sua nota para o filme? ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }
        System.out.println("Média avaliação: " + mediaAvaliacao / 3);

        System.out.println("Com while");
        int i = 0;
        mediaAvaliacao = 0.0;
        while (i < 3) {
            System.out.println("Qual a sua nota para o filme? ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
            i++;
        }
        System.out.println("Média avaliação: " + mediaAvaliacao / 3);
    }
}
