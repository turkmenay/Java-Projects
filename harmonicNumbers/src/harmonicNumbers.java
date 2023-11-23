import java.util.Scanner;

public class harmonicNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("please a number for harmonic serial : ");
        int n = inp.nextInt();
        double total = 0;

        for(double i = 1; i<=n; i++){
            total += (1/i);
        }

        System.out.println(total);
    }
}