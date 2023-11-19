import java.util.Scanner;

public class powsOf4and5 {
    public static void main(String[] args) {
        Scanner limit = new Scanner(System.in);
        int sayac4=0, sayac5=0;
        System.out.print("Lütfen bir sayı giriniz : ");
        int n = limit.nextInt();
        System.out.println(n + " e kadar olan 4 ve 5'in kuvvetlerini aşağıdadır!!!");

        for (int i=1; i<=n; i*=4){
            sayac4 +=1;
            System.out.println("4'un "+(sayac4-1)+" kuvveti : "+i);
        }
        System.out.println();
        for (int j=1; j<=n; j*=5){
            sayac5 +=1;
            System.out.println("5'in "+(sayac5-1)+" kuvveti : "+j);
        }

    }
}