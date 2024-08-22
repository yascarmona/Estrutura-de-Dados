public class StaticList {
    private int[] data;
    private int size;

    public StaticList(int size) {
        this.data = new int[size];
        this.size = 0; // Indica que inicialmente não há elementos na lista
    }

    public void clear() {
        for (int i = 0; i < data.length; i++) {
            data[i] = 0; // Reseta todos os elementos para 0
        }
        size = 0; // Reseta o tamanho para 0
    }

    public void add(int data) {
        if (isFull()) {
            throw new StackOverflowError("Lista cheia");
        }
        this.data[size] = data; // Adiciona na próxima posição disponível
        size++;
    }

    public void add(int data, int pos) {
        if (isFull()) {
            throw new StackOverflowError("Lista cheia");
        }
        if (pos < 0 || pos >= this.data.length) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        if (this.data[pos] == 0) { // Só incrementa o size se estiver adicionando em uma posição vazia
            size++;
        }
        this.data[pos] = data; // Adiciona diretamente na posição especificada
    }

    public int remove(int pos) {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        if (pos < 0 || pos >= this.data.length) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        int removedElement = this.data[pos];
        this.data[pos] = 0; // Marca o espaço como disponível
        size--;
        return removedElement;
    }

    public boolean isFull() {
        return size == this.data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getData(int pos) {
        if (pos < 0 || pos >= this.data.length) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        return this.data[pos];
    }

    public int getSize() {
        return size;
    }

    public int[] getAllData() {
        return this.data;
    }

    public int find(int data) {
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == data) {
                return i;
            }
        }
        return -1; // Retorna -1 se o dado não for encontrado
    }
}
