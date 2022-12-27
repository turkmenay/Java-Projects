import java.util.Scanner;
public class Taksimetre{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Değişkenler
        double instance, price, perKm ;
        System.out.println("Bu Program Taksimetre Hesabı Yapabilmenizi sağlar");
        System.out.println("Lütfen KM cinsinden gideceğiniz mesafeyi giriniz");
        instance = sc.nextDouble();
        price = 10;
        perKm = 2.20;
        price += instance*perKm;
        price = (price<20) ? 20 : price;
        System.out.println("Ödenecek Ücret "+price+" TL'dir.");

        }
    }
