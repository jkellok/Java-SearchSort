import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner number = new Scanner(System.in);
        String choice = "";
        int numberToSearch = 0;

        while (true) {
            System.out.println("Menu of Searching and Sorting Testbed.\n");
            System.out.println("1)\tLinear searching");
            System.out.println("2)\tBinary searching");
            System.out.println("3)\tO(n^2) type of sorting");
            System.out.println("4)\tO(n*log(n)) type of sorting");
            System.out.println("5)\tSorting performance (not implemented yet)\n");
            System.out.println("q/Q) Quit\n");
            System.out.print("Your choice:\t");

            choice = input.nextLine();

            if ("q".equalsIgnoreCase(choice)) {
                break;
            }
            else if ("1".equals(choice)) {
                System.out.print("In the list are values 0, ..., 9; " +
                        "which value would you like to search with linear search? ");
                numberToSearch = number.nextInt();
                LinearSearching linear = new LinearSearching();
                if (linear.findNumber(numberToSearch)) {
                    System.out.println("\nFound!");
                }
                else
                    System.out.println("\nNot found");
            }
            else if ("2".equals(choice)) {
                System.out.print("In the list are values 0, ..., 9; " +
                        "which value would you like to search with binary search? ");
                numberToSearch = number.nextInt();
                BinarySearching linear = new BinarySearching();
                if (linear.findNumber(numberToSearch)) {
                    System.out.println("\nFound!");
                }
                else
                    System.out.println("\nNot found");
            }
            else if ("3".equals(choice)) {
                new SelectionSort();
            }
            else if ("4".equals(choice)) {
                new QuickSort();
            }
            else if ("5".equals(choice)) {
                System.out.println("\nYou chose number 5. Not implemented.");
            }
            else {
                System.out.println("\nUnknown choice. Try again.");
            }
            System.out.println();
        }

    }
}
