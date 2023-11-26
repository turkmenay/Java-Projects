import java.util.Scanner;

public class invertedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please a step number : ");
        int n = input.nextInt();
        //n=10
        for(int i=n; i>0; i--){
            for(int j=0; j<(n-i); j++){
                System.out.print(" ");
            }
            for (int s=(2*i)-1; s>0; s--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}