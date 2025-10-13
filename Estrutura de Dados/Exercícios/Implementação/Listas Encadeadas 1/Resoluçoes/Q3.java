package Resoluçoes;

class Node {
    int valor;
    Node proximo;

    public Node(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

public class Q3 {
    public static Node adicionarNo(Node head, int valor) {
        Node novoNo = new Node(valor);
        novoNo.proximo = head;
        return novoNo;
    }

    public static void main(String[] args) {
        Node head = null;

        head = adicionarNo(head, 15);
        head = adicionarNo(head, 10);
        head = adicionarNo(head, 5);

        head = adicionarNo(head, 2);

        Node atual = head;
        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }
        System.out.println("NULL");
    }
}
