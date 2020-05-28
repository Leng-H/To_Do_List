import org.w3c.dom.Node;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * A "simple" to-do list.
 */

public class toDoList {
    public static void main(String[] args) {
        // Ask for user's input, end with a -1 (Experiment with a bufferedstring?)
        // Strikethrough?
        // Give like a cool frame?
        // Change between X and O?

        LinkedList<String> myList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean repeatLoop = true;
        while(repeatLoop) {
            menu();
            System.out.print("Enter your choice: ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    myList = add();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    printList(myList);
                    break;
                case 4:
                    repeatLoop = false;
                    System.out.println("End of program");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
        sc.close();
    }

    public static void menu() {
        System.out.println("Please choose according to the numbers: ");
        System.out.println("1). Add item(s)");
        System.out.println("2). Delete item(s)");
        System.out.println("3). Print list");
        System.out.println("4). Exit");
    }

    public static LinkedList<String> add() {
        System.out.println("Please add your items (Enter -1 to stop)");
        LinkedList<String> myList = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        boolean isContinueAdding = true;
        while (isContinueAdding) {
            String input = sc.nextLine();
            if (input.compareToIgnoreCase("-1") == 0) {
                isContinueAdding = false;
            } else {
                myList.add(input);
            }
        }
        sc.close();
        return myList;
    }

    public static void removeItem() {

    }

    public static void printList(LinkedList<String> myList) {
        // Iterating linked list
        Iterator<String> iterator = myList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}