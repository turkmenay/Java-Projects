import java.util.Scanner;
public class Hipotenus{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a, b, c, alan, cevre;
        System.out.println("Dik Üçgen Hipotenüs, Alan ve Çevre hesaplama Programına Hoşgeldiniz");
        System.out.println("Lütfen dik kenarın uzunluğunu giriniz : ");
        a = sc.nextDouble();
        System.out.println("Lütfen yatay kenarın uzunluğunu giriniz : ");
        b = sc.nextDouble();
        c = Math.sqrt((a*a)+(b*b));
        alan = (a*b)/2;
        cevre = (a+b+c);
        System.out.println("Hipotenüs uzunluğu : "+c);
        System.out.println("Üçgenin alanı : "+alan);
        System.out.println("Üçgenin çevresi : "+cevre);
    }
}