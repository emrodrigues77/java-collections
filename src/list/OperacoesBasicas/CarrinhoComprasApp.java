package list.OperacoesBasicas;

public class CarrinhoComprasApp {

    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionarItem("Camiseta", 49.90, 2);
        carrinho.adicionarItem("Calca", 79.90, 1);
        carrinho.adicionarItem("Blusa", 59.90, 3);

        carrinho.exibirItens();
        System.out.println("Total: " + carrinho.calcularValorTotal());

        carrinho.removerItem("Camiseta");
        carrinho.exibirItens();
        System.out.println("Total: " + carrinho.calcularValorTotal());
    }
}
