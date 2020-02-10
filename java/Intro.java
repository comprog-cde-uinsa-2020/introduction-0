import java.util.Scanner;

public class Intro {

    public static void main(String []args) {
        
        int a; // variable
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Example using variable in java \n");
        System.out.print("Enter length of side : ");
 
        int s = scanner.nextInt();

        a = s * s; // calculate area; then store in a

        System.out.print("the formula a = s * s");
        System.out.print("\n");

        int threshold = 100;

        // branching 
        System.out.print("\n");
        if (s > threshold) {
          System.out.print(String.format("size: %d more than threshold: %d", s, threshold));
        } else if ( s == 100) {
          System.out.print(String.format("size: %d equal with threshold: %d", s, threshold));
        } else {
          System.out.print(String.format("size: %d less than threshold: %d", s, threshold));       
        }

        System.out.print("\n");
        System.out.print(String.format("Area of Square = %d", a));

    }
}