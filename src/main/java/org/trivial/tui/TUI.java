/*
 * GNU GENERAL PUBLIC LICENSE
 * 2022 trivial.org
 */
package org.trivial.tui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Text User Interface simple input and output functions for the CLI (Command
 * Line Interface)
 *
 * @author Julian Pieles (dev@pieles.org)
 */
public class TUI {

    /**
     * Scanner for the whole Class
     */
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Message when the readNumber functions get a String instead of a number
     */
    private static final String NOT_A_NUMBER = "input is not number";

    /**
     * Menu Entry Format String
     */
    private static final String MENU_ENTRY = "%d) %s\n";
    
    private static final String DOT = ".";
    private static final String SPACE = " ";
    private static final String COLON = ":";

    /**
     * Text User Interface simple input and output functions for the CLI
     * (Command Line Interface)
     */
    private TUI() {
        // nothing to do
    }

    /**
     * print formatted
     *
     * @param text
     * @param objects
     */
    public static void printf(String text, Object... objects) {
        System.out.printf(text, objects);
    }

    /**
     * print
     *
     * @param text
     */
    public static void print(String text) {
        System.out.print(text);
    }

    /**
     * print line
     *
     * @param text
     */
    public static void println(String text) {
        System.out.println(text);
    }

    /**
     * Read whole line as String
     *
     * @return input line
     */
    public static String readLine() {
        return scanner.nextLine();
    }

    /**
     * Read Integer input
     *
     * @return input int
     */
    public static int readInt() {
        String line = readLine();
        boolean notNumber = true;
        int num = 0;
        while (notNumber) {
            try {
                num = Integer.parseInt(line);
                notNumber = false;
            } catch (NumberFormatException ex) {
                println(NOT_A_NUMBER);
            }
        }
        return num;
    }

    /**
     * Read Float input
     *
     * @return input float
     */
    public static float readFloat() {
        String line = readLine();
        boolean notNumber = true;
        float num = 0;
        while (notNumber) {
            try {
                num = Float.parseFloat(line);
                notNumber = false;
            } catch (NumberFormatException ex) {
                println(NOT_A_NUMBER);
            }
        }
        return num;
    }

    /**
     * Read double input
     *
     * @return input double
     */
    public static double readDouble() {
        String line = readLine();
        boolean notNumber = true;
        double num = 0;
        while (notNumber) {
            try {
                num = Double.parseDouble(line);
                notNumber = false;
            } catch (NumberFormatException ex) {
                println(NOT_A_NUMBER);
            }
        }
        return num;
    }

    /**
     * print a menu
     * <br><br>
     * MenuName:<br>
     * 1) Entry1<br>
     * 2) Entry2<br>
     * 3) Entry3<br>
     *
     * @param name Menutitle
     * @param entries Menu entries
     */
    public static void menu(String name, String... entries) {
        println(name + COLON);
        for (int i = 0; i < entries.length; i++) {
            printf(MENU_ENTRY, i + 1, entries[i]);
        }
    }

    /**
     * choose a option from a list
     *
     * @param <T> Generic
     * @param name Heading to prompt the user to choose an options
     * @param list List of options
     * @return Option the user chose
     */
    public static <T> T getSingleOption(String name, List<T> list) {
        println(name + COLON);
        printListEntries(list);

        println("choose");
        int index = readInt();

        return list.get(index);
    }

    /**
     * Print all elements from a list
     *
     * @param <T> Generic
     * @param list List to print
     * @return Generic
     */
    public static <T> List<T> printListEntries(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            printf(MENU_ENTRY, i + 1, list.get(i).toString());
        }
        return list;
    }

    /**
     * Print all elements from an array
     *
     * @param array Array to print
     */
    public static void printArray(Object[] array) {
        for (Object array1 : array) {
            println(array1.toString());
        }
    }

    /**
     * Choose multiple options from a list
     *
     * @param <T> Generic
     * @param name Heading to prompt the user to select an item
     * @param list list of all option items
     * @return List of selected Items
     */
    public static <T> List<T> getMultiOption(String name, List<T> list) {
        println(name + COLON);
        printListEntries(list);
        String[] options = readLine().split(SPACE);

        List<T> list2 = new ArrayList<>();

        for (String s : options) {
            int i = Integer.parseInt(s);
            list2.add(list.get(i));
        }

        return list2;
    }

    /**
     * read a Date input
     *
     * @return read in date
     */
    public static LocalDate readDate() {
        String line = readLine();
        String[] elems = line.split(DOT);
        int day = Integer.parseInt(elems[0]);
        int month = Integer.parseInt(elems[1]);
        int year = Integer.parseInt(elems[2]);

        return LocalDate.of(year, month, day);
    }

}
