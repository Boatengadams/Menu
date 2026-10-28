// Question: How can a menu add, remove, display, and exit an integer list?
package Arrays.List;
//A Menu program with the following options
// Add Element
//Remove Element
//Display Element
//Exit

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(String.format("Select an option:%n 1.Add Element%n 2.Remove Element%n 3.Display Element%n 4.Exit"));
            int userInput = input.nextInt();

            if(userInput==1){
                System.out.print("Enter an integer:");
                integers.add(input.nextInt());
                System.out.println("Added");
            }
            else if(userInput==2){
                System.out.print("Enter the number to remove: ");
                int elementToRemove = input.nextInt();
                if(integers.contains(elementToRemove)){
                    integers.remove(Integer.valueOf(elementToRemove));
                    System.out.println("Removed.");
                }else
                    System.out.println("Element not found.");
            }
            else if(userInput==3){
                System.out.println("Yout List: " + integers);

            } else if (userInput == 4) {
                System.out.println("Good bye!!");
                break;
            }

        }
    }

}
