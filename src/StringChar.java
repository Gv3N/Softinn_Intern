//count char in a string
//display longest word in a string

import java.util.Scanner;

public class StringChar {
    public void stringchar(){
        Scanner input = new Scanner(System.in);

        //count all characters
        int a = 0,b = 0,c = 0,d = 0,e = 0,f = 0,g = 0,h = 0,i = 0,j = 0,k = 0,l = 0,m = 0,n = 0,
                o = 0,p = 0,q = 0,r = 0,s = 0,t = 0,u = 0,v = 0,w = 0,x = 0,y = 0,z = 0;
        //count digits
        int digits = 0;
        //count blank spaces
        int space = 0;
        //count '.'
        int dot = 0;
        //count special characters
        int special = 0;

        System.out.println("Welcome to String to Characters Breakdown");
        System.out.println("Please insert a text and press enter to continue:");
        String text = input.nextLine();//reads user inputs into string

        //to calc longest word
        String [] word = text.split(" ");
        String maxWord = "";

        for (int wrd = 0; wrd < word.length; wrd++){
            if(word[wrd].length() >= maxWord.length()){
                maxWord = word[wrd];
            }
        }//end for

        //converts the characters into lowercase to avoid redundant uppercase
        text = text.toLowerCase();

        //counting algorithm
        for (int value = 0; value < text.length(); value++){
            char chr = text.charAt(value);//reads char value
            //vowels
            if(chr == 'a'){
                ++a;
            }
            else if(chr == 'e'){
                ++e;
            }
            else if(chr == 'i'){
                ++i;
            }
            else if(chr == 'o'){
                ++o;
            }
            else if(chr == 'u'){
                ++u;
            }
            //consonant
            else if(chr == 'b'){
                ++b;
            }
            else if(chr == 'c'){
                ++c;
            }
            else if(chr == 'd'){
                ++d;
            }
            else if(chr == 'f'){
                ++f;
            }
            else if(chr == 'g'){
                ++g;
            }
            else if(chr == 'h'){
                ++h;
            }
            else if(chr == 'j'){
                ++j;
            }
            else if(chr == 'k'){
                ++k;
            }
            else if(chr == 'l'){
                ++l;
            }
            else if(chr == 'n'){
                ++n;
            }
            else if(chr == 'm'){
                ++m;
            }
            else if(chr == 'p'){
                ++p;
            }
            else if(chr == 'q'){
                ++q;
            }
            else if(chr == 'r'){
                ++r;
            }
            else if(chr == 's'){
                ++s;
            }
            else if(chr == 't'){
                ++t;
            }
            else if(chr == 'v'){
                ++v;
            }
            else if(chr == 'w'){
                ++w;
            }
            else if(chr == 'x'){
                ++x;
            }
            else if(chr == 'y'){
                ++y;
            }
            else if(chr == 'z'){
                ++z;
            }
            else if(chr >= '0'&& chr <='9'){
                ++digits;
            }
            else if(chr == ' '){
                ++space;
            }
            else if(chr == '.'){
                ++dot;
            }
            else {
                ++special;
            }//end if statement
        }//end for loop

        //display output
        //sorry for all the if, else if does not produce output so i use all if for now.
        System.out.print("Numbers of Vowels =>");
        if(a > 0){
            System.out.print(" A:"+a);
        }
        if(e > 0){
            System.out.print(" E:"+e);
        }
        if(i > 0){
            System.out.print(" I:"+i);
        }
        if(o > 0){
            System.out.print(" O:"+o);
        }
        if(u > 0){
            System.out.print(" U:"+u);
        }
        System.out.println("");
        System.out.print("Numbers of Consonant =>");
        if(b > 0){
            System.out.print(" B:"+b);
        }
        if(c > 0){
            System.out.print(" C:"+c);
        }
        if(d > 0){
            System.out.print(" D:"+d);
        }
        if(f > 0){
            System.out.print(" F:"+f);
        }
        if(g > 0){
            System.out.print(" G:"+g);
        }
        if(h > 0){
            System.out.print(" H:"+h);
        }
        if(j > 0){
            System.out.print(" J:"+j);
        }
        if(k > 0){
            System.out.print(" K:"+k);
        }
        if(l > 0){
            System.out.print(" L:"+l);
        }
        if(m > 0){
            System.out.print(" M:"+m);
        }
        if(n > 0){
            System.out.print(" N:"+n);
        }
        if(p > 0){
            System.out.print(" P:"+p);
        }
        if(q > 0){
            System.out.print(" Q:"+q);
        }
        if(r > 0){
            System.out.print(" R:"+r);
        }
        if(s > 0){
            System.out.print(" S:"+s);
        }
        if(t > 0){
            System.out.print(" T:"+t);
        }
        if(v > 0){
            System.out.print(" V:"+v);
        }
        if(w > 0){
            System.out.print(" W:"+w);
        }
        if(x > 0){
            System.out.print(" X:"+x);
        }
        if(y > 0){
            System.out.print(" Y:"+y);
        }
        if(z > 0){
            System.out.print(" Z:"+z);
        }
        System.out.println("");
        System.out.print("Numbers of Special Characters =>");
        if(space > 0){
            System.out.print(" Space:"+space);
        }
        if(dot > 0){
            System.out.print(" .:"+dot);
        }
        if(special > 0){
            System.out.print(" Others:"+special);
        }
        System.out.println("");
        System.out.print("Numbers of Digits =>");
        if(digits > 0){
            System.out.print(digits);
        }
        else {
            System.out.print("0");
        }
        System.out.println("");
        System.out.print("Longest Word =>"+maxWord);
        question();
    }//end method

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
                stringchar();
        }//end switch
    }//end method question
}//end class
