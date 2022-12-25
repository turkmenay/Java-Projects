import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya, biyoloji, turkce, muzik;
        Scanner sc = new Scanner (System.in);
        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = sc.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = sc.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = sc.nextInt();

        System.out.print("Biyoloji Notunuzu Giriniz : ");
        biyoloji = sc.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce   = sc.nextInt();

        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = sc.nextInt();

        int toplam = (mat+fizik+kimya+biyoloji+turkce+muzik);
        double ortalama = toplam/6.0;
        boolean sonuc = ortalama<60.0;
        String str = sonuc ? "KALDI" : "GEÇTİ";
        System.out.println("Ortalamanız : "+ ortalama);
        System.out.print(str);
    }
}