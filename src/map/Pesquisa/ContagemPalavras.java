package map.Pesquisa;

import java.util.HashMap;

public class ContagemPalavras {
    private HashMap<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        this.palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        this.palavras.remove(palavra);
    }

    public void exibirContagemPalavras() {
        for (int i = 0; i < this.palavras.size(); i++) {
            System.out.println(this.palavras.keySet().toArray()[i] + ": " + this.palavras.values().toArray()[i]);
        }
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = "";
        int contagemMaisFrequente = Integer.MIN_VALUE;

        for (String palavra : this.palavras.keySet()) {
            if (this.palavras.get(palavra) > contagemMaisFrequente) {
                contagemMaisFrequente = this.palavras.get(palavra);
                palavraMaisFrequente = palavra;
            }
        }

        return palavraMaisFrequente;
    }
}
