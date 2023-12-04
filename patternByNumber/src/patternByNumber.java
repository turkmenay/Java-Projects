import java.util.Scanner;

public class patternByNumber {
    static void pattern(int a, int b, int c){
        if(b>a) return;
        if(b<=0) c*=-1;
        System.out.print(" "+b+" ");
        pattern(a,b+(c*5),c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert a number : ");
        int number = sc.nextInt();

        pattern(number,number,-1);

    }
}