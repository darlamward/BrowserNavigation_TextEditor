// Text Editor Code and Functions. Insert a line, move up and down lines, move left and right on current line,
// delete a line, edit a line and exit the console. I've included a text file to show what an example of the output
// would look like and how the commands should be typed in.
// Completed by Darla Ward.
// Completed on June 9, 2023

package com.keyin;

public class TextEditor {
    private Node2 currentLine;
    private int cursorPosition;

    public TextEditor() {
        currentLine = null;
        cursorPosition = 0;
    }

    public void insertLine(String line) {
        Node2 newNode = new Node2(line);
        if (currentLine == null) {
            currentLine = newNode;
        } else {
            newNode.next = currentLine.next;
            if (currentLine.next != null) {
                currentLine.next.previous = newNode;
            }
            currentLine.next = newNode;
            newNode.previous = currentLine;
            currentLine = newNode;
        }
        cursorPosition = line.length();
    }


    public void deleteLine() {
        if (currentLine == null) {
            System.out.println("Buffer is empty!");
        } else {
            if (currentLine.previous != null) {
                currentLine.previous.next = currentLine.next;
            }
            if (currentLine.next != null) {
                currentLine.next.previous = currentLine.previous;
            }
            if (currentLine.previous == null) {
                currentLine = currentLine.next;
            } else {
                currentLine = currentLine.previous;
            }
        }
    }
    public void moveUp() {
        if (currentLine != null && currentLine.next != null) {
            currentLine = currentLine.next;
            cursorPosition = currentLine.line.length();
        }
    }

    public void moveDown() {
        if (currentLine != null && currentLine.previous != null) {
            currentLine = currentLine.previous;
            cursorPosition = currentLine.line.length();
        }
    }
    public void moveCursorLeft() {
        if (currentLine != null && cursorPosition > 0) {
            cursorPosition--;
        } else if (currentLine != null && currentLine.previous != null) {
            currentLine = currentLine.previous;
            cursorPosition = currentLine.line.length();
        }
    }

    public void moveCursorRight() {
        if (currentLine != null && cursorPosition < currentLine.line.length()) {
            cursorPosition++;
        } else if (currentLine != null && currentLine.next != null) {
            currentLine = currentLine.next;
            cursorPosition = 0;
        }
    }
    public void editLine(String line) {
        if (currentLine != null) {
            currentLine.line = line;
        }
    }

    public void displayBuffer() {
        Node2 temp = currentLine;
        while (temp != null) {
            if (temp == currentLine) {
                StringBuilder lineBuilder = new StringBuilder(temp.line);
                lineBuilder.insert(cursorPosition, "|");
                System.out.println(lineBuilder);
            } else {
                System.out.println(temp.line);
            }
            temp = temp.previous;
        }
    }
}