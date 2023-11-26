import java.util.Scanner;

public class ebobEkokCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        int n1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int n2 = inp.nextInt();
        int i =1, j=1;
        int ebob, ekok;

        if (n1>=n2){
            i = n1;
        }else{
            i = n2;
        }
        while(i>1){
            if(n1%i==0 && n2%i==0){
                ebob = i;
                System.out.println("ebob = "+ebob);
                break;
            }
            i--;
        }

        while (j<=(n1*n2)){
            if(j%n1==0 && j%n2==0){
                ekok = j;
                System.out.println("ekok = "+j);
                break;
            }
            j++;
        }
    }
}