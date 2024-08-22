import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da lista: ");
        int size = scanner.nextInt();

        StaticList list = new StaticList(size);

        boolean running = true;

        while (running) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar item");
            System.out.println("2. Adicionar item em posição específica");
            System.out.println("3. Remover item");
            System.out.println("4. Mostrar lista");
            System.out.println("5. Limpar lista");
            System.out.println("6. Encontrar item");
            System.out.println("7. Sair");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    if (list.isFull()) {
                        System.out.println("A lista está cheia. Não é possível adicionar mais itens.");
                    } else {
                        System.out.print("Digite o número para adicionar: ");
                        int data = scanner.nextInt();
                        list.add(data);
                        System.out.println("Número " + data + " adicionado à lista.");
                    }
                    break;

                case 2:
                    if (list.isFull()) {
                        System.out.println("A lista está cheia. Não é possível adicionar mais itens.");
                    } else {
                        System.out.print("Digite o número para adicionar: ");
                        int data = scanner.nextInt();
                        System.out.print("Digite a posição onde deseja adicionar: ");
                        int pos = scanner.nextInt();
                        list.add(data, pos);
                        System.out.println("Número " + data + " adicionado na posição " + pos + " da lista.");
                    }
                    break;

                case 3:
                    if (list.isEmpty()) {
                        System.out.println("A lista está vazia. Não há itens para remover.");
                    } else {
                        System.out.print("Digite a posição do item que deseja remover: ");
                        int pos = scanner.nextInt();
                        int removedItem = list.remove(pos);
                        System.out.println("Número " + removedItem + " removido da posição " + pos + " da lista.");
                    }
                    break;

                case 4:
                    System.out.println("Lista atual:");
                    int[] allData = list.getAllData();
                    for (int i = 0; i < allData.length; i++) {
                        System.out.print(allData[i] + " ");
                    }
                    System.out.println();
                    break;

                case 5:
                    list.clear();
                    System.out.println("Lista limpa.");
                    break;

                case 6:
                    System.out.print("Digite o número que deseja encontrar: ");
                    int data = scanner.nextInt();
                    int pos = list.find(data);
                    if (pos == -1) {
                        System.out.println("Número não encontrado na lista.");
                    } else {
                        System.out.println("Número encontrado na posição " + pos + ".");
                    }
                    break;

                case 7:
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
