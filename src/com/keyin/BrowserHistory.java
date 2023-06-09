// A Browser Navigation Program that navigates forwards and backwards through links.
// Completed by Darla Ward
// Completed on June 9, 2023

package com.keyin;

class BrowserHistory {
    private Node current;

    public BrowserHistory() {
        current = null;
    }

    public void visit(String url) {
        Node newNode = new Node(url);
        if (current != null) {
            current.next = newNode;
            newNode.previous = current;
        }
        current = newNode;
    }

    public void goBack() {
        if (current != null && current.previous != null) {
            current = current.previous;
            System.out.println("Navigating Back a Page\n");
        }
    }

    public void goForward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Navigating Forward a Page\n");
        }
    }

    public void printHistory() {
        Node temp = current;
        System.out.println("Browser History Display:");
        while (temp != null) {
            System.out.println(temp.url);
            temp = temp.previous;
        }
        System.out.println();
    }
}
