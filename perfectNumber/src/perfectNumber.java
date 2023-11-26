import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      int number, inspector = 0;

        System.out.print("please insert a number : ");
        number = inp.nextInt();

        for(int i=1; i<number; i++){
            if(number%i==0){
                inspector +=i;
                System.out.println(i+"-"+inspector);
            }
        }
        if(inspector==number){
            System.out.println(number+" is a perfect number!");
        }else{
            System.out.println(number+" is NOT a perfect number!");
        }

    }
}