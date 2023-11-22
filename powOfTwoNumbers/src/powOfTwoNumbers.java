import java.util.Scanner;

public class powOfTwoNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n,k;
        int total = 1;
        System.out.print("Please enter a number : ");
        n = input.nextInt();
        System.out.print("Please enter a pow : ");
        k = input.nextInt();

        for(int i=1; i<=k ; i++){
            total *= n;
        }
        System.out.println("Result of "+n+"^"+k+" is "+total);
    }
}