/**
 * User enters a string (test)
 *Get the length of the string (4)
 * Get the last value of the word (t)
 * Then get the second to last (s)
 * Continue getting value until the first letter of the word (e,t)
 * print each character in descending order (
 * */







import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = keyboard.nextLine();
        int length = word.length();
        for(int i = length; i > 0 ; i--){
            System.out.print(word.charAt(i-1));
        }
    }
}






