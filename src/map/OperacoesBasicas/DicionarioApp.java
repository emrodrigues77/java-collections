package map.OperacoesBasicas;

public class DicionarioApp {

    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Java", "Linguagem de programação");
        dicionario.adicionarPalavra("MySQL", "Banco de dados");
        dicionario.adicionarPalavra("CSS", "Estilo de folha de estilo");
        dicionario.exibirPalavras();

        String definicao = dicionario.pesquisarPorPalavra("Java");        
        System.out.println(definicao);

        dicionario.removerPalavra("MySQL");
        dicionario.exibirPalavras();
    }
}
