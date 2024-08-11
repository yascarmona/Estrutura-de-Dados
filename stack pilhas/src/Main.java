import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Defina o tamanho da pilha:");
        int size = scanner.nextInt();

        Stack<Integer> stack = new Stack<>(size);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar um item à pilha (push)");
            System.out.println("2 - Remover um item da pilha (pop)");
            System.out.println("3 - Verificar se a pilha está cheia");
            System.out.println("4 - Verificar se a pilha está vazia");
            System.out.println("5 - Limpar a pilha");
            System.out.println("6 - Sair");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    if (stack.isFull()) {
                        System.out.println("A pilha está cheia. Não é possível adicionar mais itens.");
                    } else {
                        System.out.println("Digite o item (número) a ser adicionado (até " + size + "):");
                        int item = scanner.nextInt();
                        if (item > size) {
                            System.out.println("O número não pode ser maior que o tamanho da pilha.");
                        } else {
                            stack.push(item);
                            System.out.println("Item " + item + " adicionado à pilha.");
                        }
                    }
                    break;

                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("A pilha está vazia. Não há itens para remover.");
                    } else {
                        int removedItem = stack.pop();
                        System.out.println("Item " + removedItem + " removido da pilha.");
                    }
                    break;

                case 3:
                    if (stack.isFull()) {
                        System.out.println("A pilha está cheia.");
                    } else {
                        System.out.println("A pilha ainda não está cheia.");
                    }
                    break;

                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        System.out.println("A pilha não está vazia.");
                    }
                    break;

                case 5:
                    stack.clear();
                    System.out.println("A pilha foi limpa.");
                    break;

                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
