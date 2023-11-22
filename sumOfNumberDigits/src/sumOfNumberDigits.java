import java.util.Scanner;
public class sumOfNumberDigits {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please a number more than 2 digits : ");
        int number=inp.nextInt();
        int result = number;
        int totalOfDigits=0;

        while(number>0){
            int remain = number%10;
            number/=10;
            totalOfDigits+=remain;

        }

        System.out.println(result+" Sum of digits : "+totalOfDigits);
    }
}