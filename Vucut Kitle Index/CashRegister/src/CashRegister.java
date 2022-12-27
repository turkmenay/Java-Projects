import java.util.Scanner;

public class CashRegister {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        //Variables
        double pear = 8, apple = 7, tomato = 11, banana = 20, aubergine = 15,
                total, adet1, adet2, adet3,adet4,adet5;
        System.out.println("How much would you like to buy?");
        System.out.print("PEAR : ");
        adet1 = sd.nextDouble();
        System.out.print("APPLE : ");
        adet2 = sd.nextDouble();
        System.out.print("TOMATO : ");
        adet3 = sd.nextDouble();
        System.out.print("BANANA : ");
        adet4 = sd.nextDouble();
        System.out.print("AUBERGINE : ");
        adet5 = sd.nextDouble();
        total = (pear*adet1)+(apple*adet2)+(tomato*adet3)+(banana*adet4)+(aubergine*adet5);
        System.out.println("TOTAL PRICE : "+total+"$");
    }
}