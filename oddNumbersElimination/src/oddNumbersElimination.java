import java.util.Scanner;

public class oddNumbersElimination {
    public static void main(String[] args) {
       Scanner k = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = k.nextInt();
        int i =1;
       while(i <= number){
           if(i%2 == 0){
               System.out.println(i);
           }
           i++;
       }

    }
}