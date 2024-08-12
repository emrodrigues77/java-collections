package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        this.palavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        this.palavras.remove(palavra);
    }

    public boolean verificarPalavra(String palavra) {
        return this.palavras.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        for (String palavra : this.palavras) {
            System.out.println(palavra);
        }
    }
}
