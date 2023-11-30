import java.util.Scanner;

public class palindromeNumber {
    static boolean isPalindrome(int number){
        int temp = number, reverseNumber=0, lastNumber=0;
        while (temp!=0){
            lastNumber = temp%10;
            reverseNumber = (reverseNumber*10)+lastNumber;
            temp = temp/10;
        }
        if(number == reverseNumber){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Insert a palindrome number (as 121) : ");
        int n = inp.nextInt();

        if(isPalindrome(n)==true){
            System.out.println(n+" is a palindrome number!");
        }else
            System.out.println(n+" is NOT a palindrome number!");
    }
}