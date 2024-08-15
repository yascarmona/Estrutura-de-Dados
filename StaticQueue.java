public class StaticQueue {
    private int top = -1;
    private int[] data;
    private int base = 0;

    public StaticQueue(int size) {
        data = new int[size];
    }

    public StaticQueue(int top, int[] data, int base) {
        this.top = top;
        this.data = data;
        this.base = base;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    // Método para adicionar um elemento no topo da fila
    public int add(int data) {
        if (isFull()) {
            throw new StackOverflowError("Fila cheia");
        }

        // Incrementa o topo e adiciona o novo elemento
        top = (top + 1) % this.data.length;
        this.data[top] = data;

        // Se a fila estava vazia, ajusta a base para o primeiro elemento
        if (isEmpty()) {
            base = top;
        }

        return this.data[top];
    }

    // Método para remover o elemento mais antigo (da base) da fila
    public int remove() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }

        int removedElement = this.data[base];

        // Ajusta a base ciclicamente
        base = (base + 1) % this.data.length;

        // Se a fila ficar vazia após a remoção, reseta os índices
        if (base == (top + 1) % this.data.length) {
            clear();
        }

        return removedElement;
    }

    // Método para limpar a fila
    public void clear() {
        top = -1;
        base = 0;
    }

    // Método para verificar se a fila está cheia
    public boolean isFull() {
        return (top + 1) % this.data.length == base && !isEmpty();
    }

    // Método para verificar se a fila está vazia
    public boolean isEmpty() {
        return top == -1;
    }
}
