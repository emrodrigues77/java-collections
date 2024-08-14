package map.OperacoesBasicas;

import java.util.HashMap;

public class Dicionario {
    private HashMap<String, String> palavras;

    public Dicionario() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        this.palavras.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        this.palavras.remove(palavra);
    }

    public void exibirPalavras() {
        for (int i = 0; i < this.palavras.size(); i++) {
            System.out.println(this.palavras.keySet().toArray()[i] + ": " + this.palavras.values().toArray()[i]);
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        return this.palavras.get(palavra);
    }
    
}
