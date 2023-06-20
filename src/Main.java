import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();


        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Inicializar a lista vazia");
            System.out.println("2. Inserir um elemento no início da lista");
            System.out.println("3. Inserir um elemento no meio da lista");
            System.out.println("4. Inserir um elemento no fim da lista");
            System.out.println("5. Ordenar os elementos em ordem crescente (Ordenação A)");
            System.out.println("6. Ordenar os elementos em ordem decrescente (Ordenação B)");
            System.out.println("7. Imprimir a lista");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    list.initialize();
                    System.out.println("Lista inicializada.");
                    break;
                case 2:
                    System.out.print("Digite o elemento a ser inserido no início da lista: ");
                    int element = scanner.nextInt();
                    list.insertAtBeginning(element);
                    System.out.println("Elemento inserido no início da lista.");
                    break;
                case 3:
                    System.out.print("Digite o elemento a ser inserido: ");
                    int data = scanner.nextInt();
                    System.out.print("Digite o elemento específico após o qual deseja inserir: ");
                    int target = scanner.nextInt();
                    list.insertAfter(data, target);
                    break;
                case 4:
                    System.out.print("Digite o elemento a ser inserido no fim da lista: ");
                    element = scanner.nextInt();
                    list.insertAtEnd(element);
                    System.out.println("Elemento inserido no fim da lista.");
                    break;
                case 5:
                    list.sortAscending();
                    System.out.println("Lista ordenada em ordem crescente (Selection Sort).");
                    break;
                case 6:
                    list.sortDescending();
                    System.out.println("Lista ordenada em ordem decrescente (Bubble Sort).");
                    break;
                case 7:
                    System.out.print("Elementos da lista: ");
                    list.printList();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
            System.out.println();
        } while (choice != 0);

        scanner.close();
    }
}