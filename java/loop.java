import java.util.Scanner;

public class Intro {

    public static void main(String []args) {
        
        int size; // variable
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Example you length of array \n");
        size = scanner.nextInt();

        int array[] = new int[size];

        // looping
        for (int i = 0; i < size; i++) {
            // System.out.println("input index [%d] value of array:",i);
            array[i] = scanner.nextInt();
        }
        
        // System.out.println("show all of array %d", array);

        for (int i = 0; i < size; i++) {
            System.out.println("input index [%d] value of array:[%d]",i, array[i]);
        }

    }
}