import java.util.Scanner;

public class KdvliFiyat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tutar, kdv, sKdv=0.18, bKdv=0.08, added;

        System.out.println("Ücret tutarını giriniz :");
        tutar = sc.nextDouble();
        if (tutar>=1000.0)
            kdv = bKdv;
        else
            kdv = sKdv;
        added = (tutar*kdv)+tutar;
        System.out.println("KDV'siz Tutar : "+tutar);
        System.out.println("KDV Oranı : "+kdv);
        System.out.println("KDV Tutarı : "+(tutar*kdv));
        System.out.println("KDV'li Tutar : "+added);

    }
}