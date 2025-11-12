package Resoluçoes;

class Node {
    int valor;
    Node proximo;

    public Node(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

public class Q6 {
    public static boolean encontrarElemento(Node head, int alvo) {
        Node atual = head;

        while (atual != null) {
            if (atual.valor == alvo) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.proximo = new Node(10);
        head.proximo.proximo = new Node(15);

        System.out.println(encontrarElemento(head, 10));
        System.out.println(encontrarElemento(head, 7));
    }
}
