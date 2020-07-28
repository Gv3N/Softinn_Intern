//main class to run all the program

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Parity par = new Parity();
        StringChar stg = new StringChar();
        Shapes sh = new Shapes();

        displayMenu();
        switch (input.nextInt()){
            case 1:
                par.parity();
                break;
            case 2:
                stg.stringchar();
                break;
            case 3:
                sh.shapes();
                break;
            case 4:
                System.out.println("Thank you");
                System.out.println("Quiting the program...");
        }//end switch
    }//end main

    public static void displayMenu() {
        System.out.println("Welcome to the program");
        System.out.println("Please choose which program to run");
        System.out.println("1. Parity[even & odd]\n2. String to Char\n3. Generate Shapes\n4.Quit the program");
        System.out.print("Selection: ");
    }//end displayMenu
}//end class


