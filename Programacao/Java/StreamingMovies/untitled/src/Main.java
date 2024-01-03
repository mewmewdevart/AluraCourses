public class Main { // Classe inicia com maiuscula
    public static void main(String[] args) {
        System.out.println("Esse e o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        // Tipos primitivos
        int anoDeLancamento = 2022; // Variavel inicia em minuscula

        boolean incluidoNoPlano = false; // Variavel inicia em minuscula
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse = """
                            Filme de aventura com gala dos anos 80
                            Ano de lancamento: 
                        """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int)(media / 2);
        System.out.println(classificacao);
    }
}
