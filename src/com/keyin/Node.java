package com.keyin;

class Node {
    public boolean line;
    String url;
    Node next;
    Node previous;

    public Node(String url) {
        this.url = url;
    }
}