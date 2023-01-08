import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        double mesafe, yas, tutar, carpan;
        int type;
        boolean level = false;

        System.out.println("Mesafeyi km olarak giriniz :");
        mesafe =sc.nextDouble();
        System.out.println("Yaşınızı giriniz :");
        yas =sc.nextDouble();
        System.out.println("Yolculuk Tipini Giriniz (1 ==> Tek Yön, 2 ==> Gidiş Dönüş) :");
        type =sc.nextInt();

        tutar = mesafe*0.10;

        if(yas<12){
            tutar *= 0.5;
        }
        else if (yas>=12 && yas<25) {
            tutar *= 0.9;
        }
        else if (yas>=65) {
            tutar *= 0.7;
        }
        else if (yas<0) {
            level = true;
        }
        if (type==2){
            tutar *= 0.8;
        }
        else if (type==1) {
            tutar = tutar;
        } else if (type>=1 || type<=2) {
            level = true;
        }
        if (level==false) {
            System.out.println("Tutar : "+tutar+" TL'dir.");
        }else{
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}