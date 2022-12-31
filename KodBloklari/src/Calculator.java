import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1, n2, choice, result;
        System.out.println("Welcome Basic Calculator!");
        System.out.print("Please Enter First Number : ");
        n1 = sc.nextInt();
        System.out.print("Please Enter Second Number : ");
        n2 = sc.nextInt();
        System.out.println("Please Choose a Choice from below : ");
        System.out.println("1.Summation\n2.Extraction\n3.Multiplication\n4.Divide");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                result = n1 + n2;
                System.out.println("Result is "+result);
                break;
            case 2:
                result = n1 - n2;
                System.out.println("Result is "+result);
                break;
            case 3:
                result = n1 * n2;
                System.out.println("Result is "+result);
                break;
            case 4:
                if (n2 != 0){
                    result = n1 / n2;
                    System.out.println("Result is "+result);
                }
                else
                    System.out.println("A number can not divide zero!");
                break;
            default:
                System.out.println("Please enter valid value!");
                break;
        }

    }
}