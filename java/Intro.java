package java;

import java.util.Scanner;

public class Intro {

    public static void main(String []args) {
        
        int a;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Example using variable in c \n");
        System.out.print("Enter length of side : ");
 
        int s = scanner.nextInt();

        a = s * s; // calculate area; then store in a

        System.out.print("the formula a = s * s");
        System.out.print("\n");
        
        System.out.print(String.format("Area of Square = %d", a));

    }
}