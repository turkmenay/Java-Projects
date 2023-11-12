import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        int password ;
        boolean isPasswordSuccess = true;
        Scanner data = new Scanner(System.in);
        while (isPasswordSuccess){
            System.out.print("Please enter your password : ");
            password = data.nextInt();
            if (password == 1008){
                System.out.println("Correct !");
                isPasswordSuccess = false;
            }
            else
            System.out.println("Wrong !");
        }
    }
}