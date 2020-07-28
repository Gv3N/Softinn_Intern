//To separate even and odd integer(parity)
//display integer for even num
//display "Odd" for odd num

import java.util.Random;
import java.util.Scanner;

public class Parity {
    public void parity(){
        int arr[] = new int [5];
        //int arr[] = {1,2,3,9,5}; //for manual testing


        Random rnd = new Random();
        int min = 1; //set min value
        int max = 10; //set max value to 9 (add one more than required limit)

        System.out.println("\nWelcome to Integer Parity");
        System.out.println("Generating 5 Random Integer...\n");

        //generate random integer & assign into array
        for (int i = 0; i < arr.length; i++){
            arr[i] =rnd.nextInt(max-min)+min;//random int generator

            //condition of stopping the loop when num 9 encountered
            //if not 9 then true
            if (arr[i] != 9){
                //even numbers algorithm
                if (arr[i] % 2 == 0){
                    System.out.println(arr[i]);
                }
                //odd numbers algorithm
                if (arr[i] % 2 != 0){
                    System.out.println(arr[i] + " is a Odd");
                }
            }//end main if
            //if 9 then false
            else {
                System.out.println(arr[i] + " is encountered, the system ends...");
                break;//breaks the loop
            }//else break
        }//end for loop
        question();
    }//end main parity

    public void question(){
        System.out.println("\nWould u like to try again or quit to main menu?");
        System.out.println("To try again enter -> 1");
        System.out.println("To quit to main menu enter -> 0");
        Scanner q = new Scanner(System.in);
        switch (q.nextInt()){
            case 0:
                System.out.println("Quiting to main menu...\n");
                Main.main(null);
                break;
            case 1:
                parity();
        }//end switch
    }//end method question
}//end class
