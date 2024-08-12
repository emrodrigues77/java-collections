package list.Pesquisa;

public class SomaNumerosApp {

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(-1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(-3);
        somaNumeros.adicionarNumero(4);
        System.out.println("Soma: " + somaNumeros.calcularSoma());
        System.out.println("Maior numero: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor numero: " + somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
    }
}
