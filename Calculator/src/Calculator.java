import java.util.Scanner;

public class Calculator {

    static void sum(int a, int b){
        int result = 0;
        result = a+b;
        System.out.println("Result of Sum : "+result);
    }
    static void minus(int a, int b){
        int result = 0;
        result = a-b;
        System.out.println("Result of Minus : "+result);
    }
    static void Times(int a, int b){
        int result = 1;
        result = a*b;
        System.out.println("Result of Times : "+result);
    }
    static void divided(int a, int b){
        if(b==0){
            System.out.println("Second number must be different of ZERO!!");
        }else {
            int result = 0;
            result = a / b;
            System.out.println("Result of Divided : " + result);
        }
    }
    static void power(int a, int b){
        int result = 1;
        for (int i=1 ; i<=b ; i++){
            result *= a;
        }
        System.out.println("Result of Power : "+result);
    }
    static void factorial(int a){
        int result = 1;
        for (int i=1 ; i<=a ; i++){
            result *= i;
        }
        System.out.println("Result of Facorial : "+result);
    }
    static void mod(int a, int b) {
        int result = 1;
        result = a % b;
        System.out.println("Result of Mod : " + result);
    }

    static void calc(int a, int b){
        int area = 0, env = 0;
        area = a*b;
        System.out.println("Result of Area : : "+area);
        env = 2*(a+b);
        System.out.println("Result of Environment : : "+env);
    }

    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        int choise = 1;
        int a,b;
        String menu =   "1. Toplama\n" +
                        "2. Çıkarma\n" +
                        "3. Çarpma\n" +
                        "4. Bölme\n" +
                        "5. Üs Alma\n" +
                        "6. Faktoriyel\n" +
                        "7. Mod Alma\n" +
                        "8. Dikdörtgen Alan ve Çevre Hesabı\n" +
                        "0. Çıkış";
        System.out.println(menu);
        while(choise!=0){
            System.out.print("Please make a choise : ");
            choise = ch.nextInt();
            if(choise==0 || choise>8){
                System.out.println("You made a wrong choise!!");
                break;
            }
            System.out.print("Insert first number : ");
            a=ch.nextInt();
            System.out.print("Insert second number : ");
            b=ch.nextInt();
            switch (choise){
                case 1 :
                    sum(a,b);
                    break;
                case 2 :
                    minus(a,b);
                    break;
                case 3 :
                    Times(a,b);
                    break;
                case 4 :
                    divided(a,b);
                    break;
                case 5 :
                    power(a,b);
                    break;
                case 6 :
                    factorial(a);
                    break;
                case 7 :
                    mod(a,b);
                    break;
                case 8:
                    calc(a,b);
                    break;
            }
        }

    }
}