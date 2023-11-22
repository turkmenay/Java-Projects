import java.util.Scanner;

public class numberOfArmstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,number,c,begin,toplambas=1,total=0,numCount=0;
        System.out.print("Please insert a number : ");
        n = input.nextInt();
        number=n;
        begin=n;
        while(n!=0){
            n/=10;
            numCount++;
        }
        for(int i=1; i<=numCount; i++){
            c=number%10;
            number/=10;

            for(int j=1; j<=numCount; j++){
                toplambas*=c;

            }
            total+=toplambas;

            toplambas=1;
        }

        if(total==begin){
            System.out.println(begin+"="+total+" Armstrong sayısıdır");
        }else{
            System.out.println(begin+"=!"+total+" Armstrong sayısı DEĞİLDİR!!");
        }






    }
}