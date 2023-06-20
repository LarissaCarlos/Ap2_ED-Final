public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Inicializar a lista vazia
    public void initialize() {
        head = null;
    }

    // Inserir um elemento no início da lista
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Inserir um elemento no meio da lista, após um elemento específico
    public void insertAfter(int data, int target) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("A lista está vazia. Não é possível inserir após o elemento específico.");
            return;
        }
        Node current = head;
        while (current != null && current.data != target)
            current = current.next;
        if (current == null) {
            System.out.println("O elemento " + target + " não foi encontrado na lista.");
            return;
        }
        newNode.next = current.next;
        if (current.next != null)
            current.next.prev = newNode;
        current.next = newNode;
        newNode.prev = current;
    }

    // Inserir um elemento no fim da lista
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null)
                current = current.next;
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // Ordenar os elementos da lista em ordem crescente (algoritmo A)
    public void sortAscending() {
        if (head == null || head.next == null)
            return;
        Node current = head;
        while (current.next != null) {
            Node minNode = findMinimum(current);
            swapNodes(current, minNode);
            current = current.next;
        }
    }

    // Encontrar o nó com o valor mínimo a partir de um determinado nó
    private Node findMinimum(Node start) {
        int min = start.data;
        Node minNode = start;
        Node current = start.next;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
                minNode = current;
            }
            current = current.next;
        }
        return minNode;
    }

    // Ordenar os elementos da lista em ordem decrescente (algoritmo B)
    public void sortDescending() {
        if (head == null || head.next == null)
            return;
        Node current = head;
        while (current.next != null) {
            Node maxNode = findMaximum(current);
            swapNodes(current, maxNode);
            current = current.next;
        }
    }

    // Encontrar o nó com o valor máximo a partir de um determinado nó
    private Node findMaximum(Node start) {
        int max = start.data;
        Node maxNode = start;
        Node current = start.next;
        while (current != null) {
            if (current.data > max) {
                max = current.data;
                maxNode = current;
            }
            current = current.next;
        }
        return maxNode;
    }

    // Trocar dois nós na lista
    private void swapNodes(Node node1, Node node2) {
        int temp = node1.data;
        node1.data = node2.data;
        node2.data = temp;
    }

    // Imprimir os elementos da lista
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
