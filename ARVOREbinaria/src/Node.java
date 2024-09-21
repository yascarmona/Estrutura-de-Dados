// Classe que representa um nó na árvore binária
public class Node {
    int value;  // Valor armazenado no nó
    Node left;  // Referência para o nó filho à esquerda
    Node right; // Referência para o nó filho à direita

    // Construtor que inicializa o nó com um valor e define os filhos como null
    public Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}