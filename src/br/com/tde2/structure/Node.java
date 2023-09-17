package br.com.tde2.structure;

class Node {
    private int data;
    private Node next;

    // Construtor que inicializa um novo nó com o dado fornecido.
    protected Node(int data) {
        this.data = data;
        this.next = null;
    }

    // Obtém o dado armazenado neste nó.
    protected int getData() {
        return data;
    }

    // Define o dado armazenado neste nó.
    protected void setData(int data) {
        this.data = data;
    }

    // Obtém o próximo nó na sequência.
    protected Node getNext() {
        return next;
    }

    // Define o próximo nó na sequência.
    protected void setNext(Node next) {
        this.next = next;
    }
}
