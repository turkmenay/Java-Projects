import java.util.Scanner;

public class recursiveOfExponential {
    static int expo(int a,int b){
        int result =1;
         if(b==0)
             return 1;

        return a*expo(a,b-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int base = sc.nextInt();
        System.out.print("Üs değeri giriniz : ");
        int exp = sc.nextInt();

        int xx = expo(base,exp);
        System.out.println(base+"^"+exp+" : "+xx);


    }
}