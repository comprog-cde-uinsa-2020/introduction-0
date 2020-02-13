import java.util.Scanner;

public class Loop {

    static void printArray(int[] dataArray) {
        for (int value: dataArray){
            System.out.printf("%d ",value);
        }
    }
    
    public static void main(String []args) {
        
        int size; // variable
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Example your length of array in java :");
        size = scanner.nextInt();

        int array[] = new int[size]; // array

        // looping
        for (int i = 0; i < size; i++) {
            System.out.printf("input index [%d] value of array:", i);
            array[i] = scanner.nextInt();
        }

        printArray(array);
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.printf("index [%s] value of array:%d ", i, array[i]);
            System.out.println();
        }

    }
}