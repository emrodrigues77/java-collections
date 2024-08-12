package set.Pesquisa;

public class ListaTarefasApp {

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");

        listaTarefas.exibirTarefas();

        System.out.println("Quantidade de tarefas: " + listaTarefas.contarTarefas());

        System.out.println("Tarefa 1 Concluída");
        listaTarefas.marcarTarefaConcluida("Tarefa 1");

        System.out.println("Tarefas concluídas: ");
        for (Tarefa tarefa : listaTarefas.obterTarefasConcluidas()) {
            System.out.println(tarefa);
        }

        System.out.println("Tarefas pendentes: ");
        for (Tarefa tarefa : listaTarefas.obterTarefasPendentes()) {
            System.out.println(tarefa);
        }
    }
}
