package com.codedemonbr;

import javax.swing.*;

public class Main {

    static private boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
	// write your code here
        boolean parseResult = false;
        String number;
        do {
            number = JOptionPane.showInputDialog("Type a int:");
            parseResult = tryParseInt(number);

        }while (!parseResult);
        int numberAsInt = Integer.parseInt(number);

        String out = String.format("Your number was : %d", numberAsInt);

        JOptionPane.showMessageDialog(null, out);

    }
}
