import java.util.Scanner;

//generate 3 shapes
public class Shapes {
    static Scanner size = new Scanner(System.in);
    static int rows, k = 0;

    public void shapes(){
        Scanner choice = new Scanner(System.in);
        System.out.println("Welcome to Shapes Generator");
        System.out.println("Please select which shapes to generate:\n");
        System.out.println("1: Pyramid\n2: Square\n3: Diamond");

        switch (choice.nextInt()){
            case 1:
                pyramid();

                break;
            case 2:
                square();
                break;
            case 3:
                diamond();
                break;
            default:
                System.out.println("Unrecognized options");
                break;
        }
    }//end method

    public void pyramid(){
        //generate pyramid/triangle
        //generate space on the sides
        System.out.println("Please insert the size of shape:");
        rows = size.nextInt();
        for(int i = 1; i <= rows; ++i, k =0){
            for(int space = 1; space <= rows -i; ++space){
                System.out.print("  ");
            }//end 2nd for
            //constant print '*'
            while(k !=2 * i -1){
                System.out.print("* ");
                ++k;
            }//end while loop
            System.out.println();
        }//end for
        question();
    }//end method

    public void diamond(){
        System.out.println("Please insert the size of shape:");
        rows = size.nextInt();
        int space = rows - 1;
        for (int j = 1; j <= rows; j++){
            for(int i = 1; i <= space; i++){
                System.out.print(" ");
            }//end 2nd for
            space--;
            for (int i =1; i<= 2 * j - 1; i++){
                System.out.print("*");
            }
            System.out.println("");
        }//end 1st big for
        space = 1;
        for (int j = 1; j <= rows - 1; j++) {
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }//end 1st for
            space++;
            for (int i = 1; i <= 2 * (rows - j) - 1; i++) {
                System.out.print("*");
            }//end 2nd for
            System.out.println("");
        }//end 2nd big for
        question();
    }//end method diamond

    public void square(){
        System.out.println("\nPlease insert the size of shape:");
        rows = size.nextInt();
        System.out.println("");
        for (int i =1; i <= rows; i++){
            for (int j =1; j <= rows; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }//end 1st for
        question();
    }//end method square

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
                shapes();
        }//end switch
    }//end method question
}//end class
