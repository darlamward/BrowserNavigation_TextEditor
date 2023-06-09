package com.keyin;

public class Node2 {
    String line;
    Node2 next;
    Node2 previous;

    public Node2(String line){
        this.line = line;
        this.previous = null;
        this.next = null;
    }
}
