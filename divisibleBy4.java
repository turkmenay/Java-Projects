import java.util.Scanner;

public class divisibleBy4 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int number, total = 0;

        do{
            System.out.print("please a number : ");
            number = inp.nextInt();
            if(number%4 == 0){
                total += number;
            }
        }while (number%2 == 0 && number > 0);
        System.out.println("Sum of Number that Divisible of 4 is "+total );
    }

}