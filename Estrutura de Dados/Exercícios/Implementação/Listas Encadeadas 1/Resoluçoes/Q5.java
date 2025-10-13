package Resoluçoes;

class Node {
    Node proximo;
    int valor;

    public Node(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

public class Q5 {
    public static int contarNumeroNos(Node head) {
        int numElementos = 0;
        Node atual = head;

        while (atual != null) {
            numElementos++;
            atual = atual.proximo;
        }

        return numElementos;
    }

    public static void main(String[] args) {
        Node head = null;

        head = new Node(7);
        head.proximo = new Node(7);
        head.proximo.proximo = new Node(7);
        head.proximo.proximo.proximo = new Node(7);
        head.proximo.proximo.proximo.proximo = new Node(7);

        int totalNos = contarNumeroNos(head);

        System.out.println("Total de nós: " + totalNos);
    }
}
