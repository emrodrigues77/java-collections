package set.Ordenacao;

public class GerenciadorAlunosApp {

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Joao", 123, 8.5);
        gerenciadorAlunos.adicionarAluno("Maria", 456, 7.0);
        gerenciadorAlunos.adicionarAluno("Pedro", 789, 9.0);
        gerenciadorAlunos.adicionarAluno("Ana", 321, 6.5);

        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.exibirAlunosPorNome();

        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
