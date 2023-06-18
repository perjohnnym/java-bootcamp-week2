import java.util.Scanner;
public class Week2Exercise1 {
    public static void main (String[] args){

        // java.lang is by default imported into JAVA
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number between 50 and 300? ");
        String yourNumber = scan.nextLine();
       // System.out.println("You typed in: " + yourNumber);
        int Nmbr = Integer.parseInt(yourNumber);

        if (Nmbr >= 50 && Nmbr <=300) System.out.println("Yes!");
        else{
            System.out.println("No!");
        }
        scan.close();
    }
}
