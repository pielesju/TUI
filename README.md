# TUI
Text User Interface

# Documentation

## `public class TUI`

Text User Interface simple input and output functions for the CLI (Command Line Interface)

 * **Author:** Julian Pieles (dev@pieles.org)

## `private static final Scanner scanner = new Scanner(System.in)`

Scanner for the whole Class

## `private static final String NOT_A_NUMBER = "input is not number"`

Message when the readNumber functions get a String instead of a number

## `private static final String MENU_ENTRY = "%d) %s\n"`

Menu Entry Format String

## `private TUI()`

Text User Interface simple input and output functions for the CLI (Command Line Interface)

## `public static void printf(String text, Object... objects)`

print formatted

 * **Parameters:**
   * `text` — 
   * `objects` — 

## `public static void print(String text)`

print

 * **Parameters:** `text` — 

## `public static void println(String text)`

print line

 * **Parameters:** `text` — 

## `public static String readLine()`

Read whole line as String

 * **Returns:** input line

## `public static int readInt()`

Read Integer input

 * **Returns:** input int

## `public static float readFloat()`

Read Float input

 * **Returns:** input float

## `public static double readDouble()`

Read double input

 * **Returns:** input double

## `public static void menu(String name, String... entries)`

print a menu <br><br> MenuName:<br> 1) Entry1<br> 2) Entry2<br> 3) Entry3<br>

 * **Parameters:**
   * `name` — Menutitle
   * `entries` — Menu entries

## `public static <T> T getSingleOption(String name, List<T> list)`

choose a option from a list

 * **Parameters:**
   * `<T>` — Generic
   * `name` — Heading to prompt the user to choose an options
   * `list` — List of options
 * **Returns:** Option the user chose

## `public static <T> List<T> printListEntries(List<T> list)`

Print all elements from a list

 * **Parameters:**
   * `<T>` — Generic
   * `list` — List to print
 * **Returns:** Generic

## `public static void printArray(Object[] array)`

Print all elements from an array

 * **Parameters:** `array` — Array to print

## `public static <T> List<T> getMultiOption(String name, List<T> list)`

Choose multiple options from a list

 * **Parameters:**
   * `<T>` — Generic
   * `name` — Heading to prompt the user to select an item
   * `list` — list of all option items
 * **Returns:** List of selected Items

## `public static LocalDate readDate()`

read a Date input

 * **Returns:** read in date

