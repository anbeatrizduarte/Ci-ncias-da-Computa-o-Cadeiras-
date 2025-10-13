package Resoluçoes;

class Node {
    Node proximo;
    int valor;

    public Node(int valor) {
        this.proximo = null;
        this.valor = valor;
    }
}

public class Q4 {
    public static Node adicionarFinal(Node cabeca, int valor) {
        Node novoNo = new Node(valor);
        if (cabeca == null) {
            return novoNo;
        }

        Node atual = cabeca;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }
        atual.proximo = novoNo;
        return cabeca;
    }

    public static void main(String[] args) {
        Node head = null;

        head = adicionarFinal(head, 5);
        head = adicionarFinal(head, 10);
        head = adicionarFinal(head, 15);

        Node atual = head;
        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }
        System.out.println("NULL");
    }
}
