/**
 * Scanner class
 * Get user to enter a number
 * Divide number by 2
 * check if remainder = 0
 * if remainder = 0, print the factors
 * else print out error message
 * */







import java.util.Scanner;

public class Factors {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = keyboard.nextInt();
        for (int i = 0; i <= num; i++){
            if ((i%2) == 0){
                System.out.print("The factors of " + num + " is " + i);
            }
        }
    }
}
