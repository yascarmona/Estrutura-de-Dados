public class FilaCircular {
    private int top = -1;
    private int base = 0;
    private Integer[] data;

    public FilaCircular(int size) {
        data = new Integer[size];
        for (int i = 0; i < size; i++) {
            data[i] = 0; // Inicializa todos os elementos como 0
        }
    }

    public int getTop() {
        return top;
    }

    public int getBase() {
        return base;
    }

    public Integer[] getData() {
        return data;
    }

    public void add(int data) {
        if (isFull()) {
            throw new StackOverflowError("Fila cheia");
        }

        top = (top + 1) % this.data.length;
        this.data[top] = data;

        if (isEmpty()) {
            base = top;
        }
    }

    public int remove() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }

        int removedElement = this.data[base];
        this.data[base] = 0; // Marca o espaço como disponível

        // Ajusta a base ciclicamente
        base = (base + 1) % this.data.length;

        // Se a fila ficar vazia após a remoção, reseta os índices
        if (base == (top + 1) % this.data.length) {
            clear();
        }

        return removedElement;
    }

    public void clear() {
        top = -1;
        base = 0;
        for (int i = 0; i < data.length; i++) {
            data[i] = 0; // Reseta todos os elementos para 0
        }
    }

    public boolean isFull() {
        return (top + 1) % this.data.length == base && !isEmpty();
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
