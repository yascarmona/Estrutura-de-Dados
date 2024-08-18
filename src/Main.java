import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da fila: ");
        int size = scanner.nextInt();

        FilaCircular queue = new FilaCircular(size);

        boolean running = true;

        while (running) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Mostrar fila");
            System.out.println("4. Limpar fila");
            System.out.println("5. Sair");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    if (queue.isFull()) {
                        System.out.println("A fila está cheia. Não é possível adicionar mais itens.");
                    } else {
                        System.out.print("Digite o número para adicionar: ");
                        int data = scanner.nextInt();
                        queue.add(data);
                        System.out.println("Número " + data + " adicionado à fila.");
                    }
                    break;

                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("A fila está vazia. Não há itens para remover.");
                    } else {
                        int removedItem = queue.remove();
                        System.out.println("Número " + removedItem + " removido da fila.");
                    }
                    break;

                case 3:
                    System.out.println("Fila atual:");
                    for (int i = 0; i < size; i++) {
                        System.out.print(queue.getData()[i] + " ");
                    }
                    System.out.println();
                    break;

                case 4:
                    queue.clear();
                    System.out.println("Fila limpa.");
                    break;

                case 5:
                    running = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
