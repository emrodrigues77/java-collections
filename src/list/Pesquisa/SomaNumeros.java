package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        
        for (int numero : this.numeros) {
            soma += numero;
        }

        return soma;
    }

    public int encontrarMaiorNumero() {
        int maior = this.numeros.get(0);

        for (int numero : this.numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }

        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = this.numeros.get(0);
        
        for (int numero : this.numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }

        return menor;
    }

    public void exibirNumeros() {
        for (int numero : this.numeros) {
            System.out.println(numero);
        }
    }
}
