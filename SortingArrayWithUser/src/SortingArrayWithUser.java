import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayWithUser {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Insert number of elements your Array : ");
        int n=inp.nextInt();
        int element;
        int[] array= new int[n];
        System.out.println("Insert elements of your Array : ");

        for (int i=0; i< array.length; i++){
            System.out.print((i+1)+". Element : ");
            element = inp.nextInt();
            array[i] = element;
        }
        Arrays.sort(array);
        System.out.print("Sorted Array : ");
        for (int j:array) {
            System.out.print(j+" ");
        }
    }
}