import java.util.Scanner;

public class Combination {
    public static void main(String[] args){
        Scanner inp_n = new Scanner(System.in);
        Scanner inp_r = new Scanner(System.in);
        System.out.println("please two numbers for combination as C(n,r) ");
        System.out.print("Please n = ");
        int n = inp_n.nextInt();
        System.out.print("Please r = ");
        int r = inp_r.nextInt();
        int diff = n-r;
        long totali=1, totalj=1, totalx=1, total=1;
        for(int i = 1 ; i<=n ; i++){
            totali *= i;
        }
        for (int j = 1; j<=r ; j++){
            totalj *= j;
        }
        for (int x = 1; x<=diff ; x++){
            totalx *= x;
        }
        System.out.println(totali);
        System.out.println(totalj);
        System.out.println(totalx);
        total = totali / ( totalj * totalx);
        System.out.println("C("+n+","+r+")= "+total);
    }
}