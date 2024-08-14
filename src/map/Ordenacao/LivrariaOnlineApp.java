package map.Ordenacao;

import java.util.List;
import java.util.Map;

public class LivrariaOnlineApp {

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("http://amzon.com/001", "O velho e o mar", "Ernest Hemingway", 110.0);
        livrariaOnline.adicionarLivro("http://amzon.com/002", "Silmarillion", "J. R. R. Tolkien", 120.0);
        livrariaOnline.adicionarLivro("http://amzon.com/003", "Harry Potter e a pedra filosofal", "J. K. Rowling", 15.0);
        livrariaOnline.adicionarLivro("http://amzon.com/004", "Harry Potter e a camara secreta", "J. K. Rowling", 18.0);
        livrariaOnline.adicionarLivro("http://amzon.com/005", "Harry Potter e o prisioneiro de Azkaban", "J. K. Rowling", 21.0);

        Map<String, Livro> livrosOrdenadosPorPreco = livrariaOnline.exibirLivrosOrdenadosPorPreco();
        System.out.println(livrosOrdenadosPorPreco);

        Map<String, Livro> livrosPorAutor = livrariaOnline.pesquisarLivrosPorAutor("J. K. Rowling");
        System.out.println(livrosPorAutor);

        List<Livro> livrosMaisCaro = livrariaOnline.obterLivrosMaisCaros();
        System.out.println(livrosMaisCaro);

        List<Livro> livrosMaisBaratos = livrariaOnline.obterLivrosMaisBaratos();
        System.out.println(livrosMaisBaratos);
    }
}
