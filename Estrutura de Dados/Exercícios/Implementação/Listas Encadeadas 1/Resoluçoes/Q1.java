package Resoluçoes;

class Node {
    int valor;
    Node proximo;

    public Node(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

public class Q1 {
    public static void conectarNos(int[] lista) {
        Node head = null;
        Node ultimo = null;

        for (int i = 0; i < lista.length; i++) {
            Node novoNo = new Node(lista[i]);

            if (head == null) {
                head = novoNo;
            } else {
                ultimo.proximo = novoNo;
            }

            ultimo = novoNo;
        }

        System.out.println("Valor do segundo nó: " + head.proximo.valor);
    }

    public static void main(String[] args) {
        int[] lista = { 10, 20, 30 };
        conectarNos(lista);
    }
}
