package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                this.tarefas.remove(tarefa);
                break;
            }
        }
    }

    public void exibirTarefas() {
        for (Tarefa tarefa : this.tarefas) {
            System.out.println(tarefa);
        }
    }

    public int contarTarefas() {
        return this.tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.isConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        
        for (Tarefa tarefa : this.tarefas) {
            if (!tarefa.isConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }
        
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.concluir();
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.pendenciar();
                break;
            }
        }
    }

    public void limparListaTarefas() {
        this.tarefas.clear();
    }
}
