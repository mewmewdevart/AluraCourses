import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito: ");
        String filme = leitura.nextLine();//Ver e Armazenar na val filme
        System.out.println(filme);

        System.out.println("Qual é o ano de lançamento?");
        int anoDeLançamento = leitura.nextInt();

        System.out.println("Qual a sua nota para o filme? ");
        double notaFilme = leitura.nextDouble(); // Qual formatacao esperar? . no USA e , no pt-br

        System.out.println("O filme: " + filme);
        System.out.println("Lançamento: " + anoDeLançamento);
        System.out.println("Nota do filme: " + notaFilme);
    }
}
