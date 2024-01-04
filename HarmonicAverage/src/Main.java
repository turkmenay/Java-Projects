import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Please insert a number as a number of Harmobic Array = ");

        int n = inp.nextInt();
        double sum = 0.0;


        for(int i=1 ; i<n+1 ; i++){
            sum += (1.0/i);

        }
        System.out.println("Value of Harmonic Array is "+(sum));

    }
}