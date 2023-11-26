import java.util.Scanner;

public class minMaxNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int min=0, max=0, counter,number;

        System.out.print("How many numbers would you insert ? : ");
        counter = inp.nextInt();


            for (int i=1; i<=counter; i++){
                System.out.print(i+".Number : ");
                number = inp.nextInt();

                if(number>=max)
                    max=number;
                else if (number <= min)
                    min=number;

            }

        System.out.println("Minumum Value is "+min);
        System.out.println("Maximum Value is "+max);
    }
}