package Resoluçoes;

class Node {
    int valor;
    Node proximo;

    public Node(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

public class Q2 {
    public static void imprimirLista(Node cabeca) {
        Node atual = cabeca;
        while (atual != null) {
            System.out.print(atual.valor + "-> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.proximo = n2;
        n2.proximo = n3;
        n3.proximo = n4;

        imprimirLista(n1);
    }
}
