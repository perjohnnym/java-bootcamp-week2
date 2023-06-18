import java.util.Scanner;

public class Week2ExampleV2 {

    public static void main (String[] args){
// java.lang is by default imported into JAVA
        Scanner scan = new Scanner(System.in);

       /* System.out.println("You said your first name is " + userInput);*/

        System.out.println("What is your first and last name? ");
        String fullName = scan.nextLine();
        /* System.out.println("Your full name is:  " + fullName);*/
        System.out.println("What is your age?");
        String age = scan.nextLine();

        if (fullName.equals("John Moreno")
                && age.equals("50")) {
            System.out.println("Hey, it's really YOU!");
            scan.close();
        } else{
            System.out.println("Hi " + fullName);
            scan.close();
        }


    }
}
