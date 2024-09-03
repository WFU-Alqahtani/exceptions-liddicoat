import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,3,4,5};
        System.out.println("Enter the index of the array to print its content");
        try {
            Scanner index = new Scanner(System.in);
            System.out.println(arr[index.nextInt()]);
        }
        catch (ArrayIndexOutOfBoundsException | InputMismatchException ex) {
            System.out.println("Problem with code detected");
        }
    }
}