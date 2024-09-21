public class Main {
    // Método principal para testar a árvore binária
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(); // Cria uma nova árvore binária

        // Insere valores na árvore
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // Imprime a travessia em ordem da árvore
        System.out.println("Travessia em ordem:");
        tree.inOrderTraversal();

        // Imprime a travessia pré-ordem da árvore
        System.out.println("Travessia pré-ordem:");
        tree.preOrderTraversal();

        // Imprime a travessia pós-ordem da árvore
        System.out.println("Travessia pós-ordem:");
        tree.postOrderTraversal();

        // Testa a busca de valores na árvore
        System.out.println("Busca pelo valor 40: " + tree.search(40));
        System.out.println("Busca pelo valor 90: " + tree.search(90));

        // Remove um valor da árvore e imprime a travessia em ordem
        System.out.println("Removendo o valor 20");
        tree.delete(20);
        System.out.println("Travessia em ordem após remoção:");
        tree.inOrderTraversal();

        // Remove outro valor da árvore e imprime a travessia em ordem
        System.out.println("Removendo o valor 30");
        tree.delete(30);
        System.out.println("Travessia em ordem após remoção:");
        tree.inOrderTraversal();

        // Remove outro valor da árvore e imprime a travessia em ordem
        System.out.println("Removendo o valor 50");
        tree.delete(50);
        System.out.println("Travessia em ordem após remoção:");
        tree.inOrderTraversal();
    }
}
