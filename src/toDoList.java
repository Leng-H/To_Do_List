import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * A "simple" to-do list.
 */

public class toDoList {
    /**
     * The main list for storing the input data.
     */
    private static LinkedList<String> myList = new LinkedList<String>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean repeatLoop = true;
        while(repeatLoop) {
            System.out.println("Please choose according to the numbers: ");
            System.out.println("1). Add item(s)");
            System.out.println("2). Delete item(s)");
            System.out.println("3). Print list");
            System.out.println("4). Exit");
            System.out.print("Enter your choice: ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    add();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    printList();
                    break;
                case 4:
                    repeatLoop = false;
                    sc.close();
                    System.out.println("End of program");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }


    public static void add() {
        System.out.println("Please add your items (Enter -1 to stop)");
        boolean isContinueAdding = true;
        while (isContinueAdding) {
            String input = sc.next();
            if (input.compareToIgnoreCase("-1") == 0) {
                isContinueAdding = false;
            } else {
                myList.add(input);
            }
        }
    }

    public static void removeItem() {
        System.out.print("Enter the item you want to remove: ");
        String item = sc.next();
        System.out.println();
        if(myList.contains(item)) {
            myList.remove(item);
            System.out.println("Removed: " + item);
        } else {
            System.out.println("Item doesn't exist");
        }
    }

    public static void printList() {
        // Iterating linked list
        Iterator<String> iterator = myList.iterator();
        System.out.print("----------------------------\n");
        System.out.print("|        TO-DO List        |\n");
        System.out.print("----------------------------\n");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----------------------------");
    }

}