package com.keyin;

import java.util.Scanner;
public class TestEditorMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------- Text Editor -----------");
        System.out.println("     I - Insert a line");
        System.out.println("     X - Delete current line");
        System.out.println("     U - Move cursor up");
        System.out.println("     D - Move cursor down");
        System.out.println("     L - Move cursor left");
        System.out.println("     R - Move cursor right");
        System.out.println("     E - Edit current line");
        System.out.println("     Q - Exit");

        while (true) {
            System.out.print("\nEnter a command: ");
            String command = scanner.nextLine();

            if (command.startsWith("I")) { // TODO: When typing the insert command, type "I" followed by a space and the word/phrase you'd like inserted.
                String line = command.substring(2);
                editor.insertLine(line);
            } else if (command.equals("X")) {
                editor.deleteLine();
            } else if (command.equals("U")) {
                editor.moveUp();
            } else if (command.equals("D")) {
                editor.moveDown();
            } else if (command.equals("L")) {
                editor.moveCursorLeft();
            } else if (command.equals("R")) {
                editor.moveCursorRight();
            } else if (command.startsWith("E")) { // TODO: When typing the edit command, type "E" followed by a space and the word/phrase you'd like inserted in the current word's place.
                String text = command.substring(2);
                editor.editLine(text);
            } else if (command.equals("Q")) {
                break;
            } else {
                System.out.println("Invalid command!");
            }

            editor.displayBuffer();
        }

        scanner.close();
    }
}