import java.util.Scanner;

public class isPrime {
    static int isPrime(int a, int b){
        if(b==1)
            return 0;
        else{
            if(a%b==0){
                return 1;
            }
        }
        return isPrime(a,b-1);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, prime;

        System.out.print("Insert a number : ");
        number = sc.nextInt();

        prime=isPrime(number,number/2);

        if(prime==0){
            System.out.println(number+ " is Prime !!");
        }
        if (prime==1){
            System.out.println(number+ " is NOT Prime !!");
        }


    }
}