package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double media) {
        Aluno aluno = new Aluno(nome, matricula, media);
        alunos.add(aluno);
    }

    public void removerAluno(int matricula) {
        Aluno alunoParaRemover = null;

        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                alunoParaRemover = aluno;
                break;
            }
        }

        alunos.remove(alunoParaRemover);
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);

        if (alunos.isEmpty()) {
            System.out.println("O conjunto está vazio!");
        }

        System.out.println(alunosPorNome);
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorAlunoPorNota());

        if (alunos.isEmpty()) {
            System.out.println("O conjunto está vazio!");
        }

        alunosPorNota.addAll(alunos);
        System.out.println(alunosPorNota);       
    }

    public void exibirAlunos() {
        alunos.forEach(System.out::println);
    }
}
