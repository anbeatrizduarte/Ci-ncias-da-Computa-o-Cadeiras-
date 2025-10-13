package Resoluçoes;

class Node {
    int valor;
    Node proximo;

    public Node(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

public class Q7 {
    public static int ultimoElemento(Node head) {
        Node atual = head;

        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        return atual.valor;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.proximo = new Node(2);
        head.proximo.proximo = new Node(3);
        head.proximo.proximo.proximo = new Node(4);
        head.proximo.proximo.proximo.proximo = new Node(5);

        Integer ultimo = ultimoElemento(head);

        if (ultimo != null) {
            System.out.println("Último elemento: " + ultimo);
        }
    }
}
