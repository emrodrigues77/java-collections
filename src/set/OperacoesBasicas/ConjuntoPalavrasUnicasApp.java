package set.OperacoesBasicas;

public class ConjuntoPalavrasUnicasApp {

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Java");
        conjuntoPalavrasUnicas.adicionarPalavra("PHP");
        conjuntoPalavrasUnicas.adicionarPalavra("Python");
        conjuntoPalavrasUnicas.adicionarPalavra("Elixir");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        boolean verificarPalavra = conjuntoPalavrasUnicas.verificarPalavra("Elixir");
        System.out.println("Elixir existe? " + verificarPalavra);

        conjuntoPalavrasUnicas.removerPalavra("Elixir");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        verificarPalavra = conjuntoPalavrasUnicas.verificarPalavra("Elixir");
        System.out.println("Elixir existe? " + verificarPalavra);
    }

}
