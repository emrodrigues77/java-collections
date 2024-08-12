package set.Pesquisa;

public class Tarefa {
    String descricao;
    boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public boolean isConcluida() {
        return this.concluida;
    }

    public void concluir() {
        this.concluida = true;
    }

    public void pendenciar() {
        this.concluida = false;
    }

    public String toString() {
        return this.descricao + " - " + (this.concluida ? "Concluida" : "Pendente");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Tarefa other = (Tarefa) obj;

        if (this.descricao == null) {
            return false;
        }

        if (!this.descricao.equalsIgnoreCase(other.descricao)) {
            return false;
        }

        return true;
    }
}
