package LinearSearch;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the fruit you want to choose: ");
            String fruit = sc.next();
            switch (fruit) {
                case "mango":
                    System.out.println("lovely fruit");
                    break;
                case "apple":
                    System.out.println("red fruit");
                    break;
                case "grapes":
                    System.out.println("samall fruit");
                    break;
                case "papaya":
                    System.out.println("long fruit");
                    break;
                case "chiku":
                    System.out.println("sweet fruit");
                    break;
                default:
                    System.out.println("sorry u have input a invalid choice");
            }
        }
    }
}