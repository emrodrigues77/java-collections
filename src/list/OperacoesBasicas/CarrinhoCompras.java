package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> itens;

    public CarrinhoCompras() {
        this.itens = new ArrayList<>();
    }    

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itens.add(item);
    }

    public void removerItem(String nome) {
        ArrayList<Item> itensRemovidos = new ArrayList<>();

        for (Item item : itens) {
            if (item.getNome().equals(nome)) {
                itensRemovidos.add(item);
            }
        }

        this.itens.removeAll(itensRemovidos);
    }  
    
    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        for (Item item : itens) {
            System.out.println(item);
        }
    }
}
