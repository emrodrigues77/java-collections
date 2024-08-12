package set.Ordenacao;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private int matricula;
    private double nota;

    public Aluno(String nome, int matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    public String toString() {
        return matricula + " - "
                + nome + ": " 
                + nota;
    }

    @Override
    public int compareTo(Aluno o) {
        return nome.compareTo(o.getNome());
    }
}

class ComparatorAlunoPorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
      return Double.compare(a1.getNota(), a2.getNota());
    }
  }
