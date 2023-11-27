import java.util.Scanner;

public class fibonacciSerial {
    public static void main(String[] args) {
        int n1=0, n2=1, n3=0, n=0;
        int count=3;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please a number of steps in Fibonacci Series: ");
        n=inp.nextInt();
        if(n==1){
            System.out.print(n1+" ");
        } else if (n==2) {
            System.out.print(n1+" "+n2);
        } else if (n>2) {
            System.out.print(n1+" "+n2);
            while (count<=n) {
                n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
                count++;
            }
            }





    }
}