import java.util.Scanner;

public class triangleFromStars {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = inp.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int s = 1; s <= (2 * i) - 1; s++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = n; i >=1 ; i--) {

            for (int j =n; j>i; j--) {
                System.out.print(" ");
            }
            for (int s = (2*i)-1; s >=1; s--) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}