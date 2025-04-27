import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        boolean executando = true;

        while (executando) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Digite a nova tarefa: ");
                    String novaTarefa = scanner.nextLine();
                    tarefas.add(novaTarefa);
                    System.out.println("Tarefa adicionada!");
                    break;

                case "2":
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa para remover.");
                    } else {
                        System.out.println("Tarefas:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                        System.out.print("Digite o número da tarefa para remover: ");
                        try {
                            int indice = Integer.parseInt(scanner.nextLine()) - 1;
                            if (indice >= 0 && indice < tarefas.size()) {
                                String removida = tarefas.remove(indice);
                                System.out.println("Tarefa '" + removida + "' removida!");
                            } else {
                                System.out.println("Número inválido.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada inválida. Use um número.");
                        }
                    }
                    break;

                case "3":
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa adicionada.");
                    } else {
                        System.out.println("Tarefas:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                    }
                    break;

                case "4":
                    executando = false;
                    System.out.println("Encerrando o programa. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
