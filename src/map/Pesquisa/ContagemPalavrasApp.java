package map.Pesquisa;

public class ContagemPalavrasApp {

    public static void main(String[] args) {

        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("Java", 1);
        contagemPalavras.adicionarPalavra("PHP", 2);
        contagemPalavras.adicionarPalavra("Python", 3);

        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.removerPalavra("Java");
        contagemPalavras.exibirContagemPalavras();

        String palavraMaisFrequente = contagemPalavras.encontrarPalavraMaisFrequente();
        System.out.println("Palavra mais frequente: " + palavraMaisFrequente);
    }
}
