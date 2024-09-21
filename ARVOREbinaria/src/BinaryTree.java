// Classe que representa a árvore binária
public class BinaryTree {
    private Node root; // Referência para o nó raiz da árvore

    // Construtor que inicializa a árvore sem nós
    public BinaryTree() {
        root = null;
    }

    // Método público para inserir um valor na árvore
    public void insert(int value) {
        root = insertRec(root, value); // Chama o método recursivo para inserir o valor
    }

    // Método recursivo para inserir um valor na árvore
    private Node insertRec(Node root, int value) {
        // Se a posição atual é nula, cria um novo nó com o valor
        if (root == null) {
            root = new Node(value);
            return root;
        }

        // Se o valor for menor, insere no lado esquerdo
        if (value < root.value)
            root.left = insertRec(root.left, value);
            // Se o valor for maior, insere no lado direito
        else if (value > root.value)
            root.right = insertRec(root.right, value);

        return root; // Retorna a raiz da árvore após a inserção
    }

    // Método público para buscar um valor na árvore
    public boolean search(int value) {
        return searchRec(root, value); // Chama o método recursivo para buscar o valor
    }

    // Método recursivo para buscar um valor na árvore
    private boolean searchRec(Node root, int value) {
        // Se o nó atual é nulo, o valor não foi encontrado
        if (root == null) return false;

        // Se o valor é igual ao do nó atual, o valor foi encontrado
        if (value == root.value)
            return true;
            // Se o valor é menor, busca no lado esquerdo
        else if (value < root.value)
            return searchRec(root.left, value);
            // Se o valor é maior, busca no lado direito
        else
            return searchRec(root.right, value);
    }

    // Método público para remover um nó com um valor específico
    public void delete(int value) {
        root = deleteRec(root, value); // Chama o método recursivo para remover o valor
    }

    // Método recursivo para remover um nó com um valor específico
    private Node deleteRec(Node root, int value) {
        // Se a árvore está vazia, retorna null
        if (root == null) return root;

        // Se o valor é menor que o do nó atual, busca e remove no lado esquerdo
        if (value < root.value)
            root.left = deleteRec(root.left, value);
            // Se o valor é maior que o do nó atual, busca e remove no lado direito
        else if (value > root.value)
            root.right = deleteRec(root.right, value);
        else {
            // Nó encontrado: considera os casos de remoção
            // Caso 1: Nó com um único filho ou nenhum
            if (root.left == null)
                return root.right; // Retorna o filho à direita, se existir
            else if (root.right == null)
                return root.left; // Retorna o filho à esquerda, se existir

            // Caso 2: Nó com dois filhos
            // Encontra o menor valor na subárvore direita (sucessor em ordem)
            root.value = minValue(root.right);
            // Remove o sucessor em ordem na subárvore direita
            root.right = deleteRec(root.right, root.value);
        }

        return root; // Retorna a raiz da árvore após a remoção
    }

    // Método auxiliar para encontrar o menor valor na subárvore
    private int minValue(Node root) {
        int minValue = root.value;
        while (root.left != null) { // Percorre até encontrar o nó mais à esquerda
            root = root.left;
            minValue = root.value;
        }
        return minValue; // Retorna o menor valor encontrado
    }

    // Método público para realizar a travessia pré-ordem da árvore
    public void preOrderTraversal() {
        preOrderRec(root); // Chama o método recursivo para percorrer a árvore
        System.out.println(); // Adiciona uma nova linha após a travessia
    }

    // Método recursivo para a travessia pré-ordem
    private void preOrderRec(Node root) {
        if (root != null) { // Se o nó não é nulo
            System.out.print(root.value + " "); // Imprime o valor do nó
            preOrderRec(root.left); // Percorre a subárvore esquerda
            preOrderRec(root.right); // Percorre a subárvore direita
        }
    }

    // Método público para realizar a travessia em ordem da árvore
    public void inOrderTraversal() {
        inOrderRec(root); // Chama o método recursivo para percorrer a árvore
        System.out.println(); // Adiciona uma nova linha após a travessia
    }

    // Método recursivo para a travessia em ordem
    private void inOrderRec(Node root) {
        if (root != null) { // Se o nó não é nulo
            inOrderRec(root.left); // Percorre a subárvore esquerda
            System.out.print(root.value + " "); // Imprime o valor do nó
            inOrderRec(root.right); // Percorre a subárvore direita
        }
    }

    // Método público para realizar a travessia pós-ordem da árvore
    public void postOrderTraversal() {
        postOrderRec(root); // Chama o método recursivo para percorrer a árvore
        System.out.println(); // Adiciona uma nova linha após a travessia
    }

    // Método recursivo para a travessia pós-ordem
    private void postOrderRec(Node root) {
        if (root != null) { // Se o nó não é nulo
            postOrderRec(root.left); // Percorre a subárvore esquerda
            postOrderRec(root.right); // Percorre a subárvore direita
            System.out.print(root.value + " "); // Imprime o valor do nó
        }
    }
}