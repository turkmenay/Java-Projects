import java.util.Scanner;

public class divisibleBy12 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please a number : ");
        int k = inp.nextInt();
        int sum = 0;
        int sayac = 0;

        for(int i = 1; i<=k ; i++){
            if(i%12 ==0){
                System.out.println(i);
                sum += i;
                sayac +=1;
            }
        }
        System.out.println("The avarage of "+sayac+"number that divisible by 12 = "+(sum/sayac));

    }
}