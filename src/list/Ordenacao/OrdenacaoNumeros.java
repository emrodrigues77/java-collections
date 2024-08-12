package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }    

    public List<Integer> ordenarAscendente() {
        ArrayList<Integer> numerosAscendentes = new ArrayList<>(this.numeros);
        Collections.sort(numerosAscendentes);
        return numerosAscendentes;
    }
    
    public List<Integer> ordenarDescendente() {
        ArrayList<Integer> numerosDescendentes = new ArrayList<>(this.numeros);
        Collections.sort(numerosDescendentes);
        Collections.reverse(numerosDescendentes);        
        return numerosDescendentes;
    }
}
