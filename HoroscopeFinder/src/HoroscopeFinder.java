import java.util.Scanner;

public class HoroscopeFinder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Değer olarak 1.ay 35.gün girildiğinde hata veriyor!!
        int day, month;
        String  horoscope="";
        boolean isError = false;
        System.out.println("Please enter value as number!!!");
        System.out.println("Please Enter Your Birth month :");
        month = sc.nextInt();
        System.out.println("Please Enter Your Birth day :");
        day = sc.nextInt();

        if(month == 1){
            if(day<=21 && day>=1){
                horoscope = "Oğlak";
            } else if (day>21 && day<=31) {
                horoscope = "Kova";
            } else System.out.println("Girdiğiniz değer eksik veya yanlış!!!");
            System.out.println("Merhaba, Burcunuz :"+horoscope);
        }
        else if(month == 2){
            if(day<=19 && day>=1){
                horoscope = "Kova";
            } else if (day>19 && day<=29) {
                horoscope = "Balık";
            } else System.out.println("Girdiğiniz değer eksik veya yanlış!!!");
            System.out.println("Merhaba, Burcunuz :"+horoscope);
        }
        else if(month == 3){
            if(day<=20 && day>=1){
                horoscope = "Balık";
            } else if (day>20 && day<=31) {
                horoscope = "Koç";
            } else System.out.println("Girdiğiniz değer eksik veya yanlış!!!");
            System.out.println("Merhaba, Burcunuz :"+horoscope);
        }
        else if(month == 4){
            if(day<=20 && day>=1){
                horoscope = "Koç";
            } else if (day>20 && day<=30) {
                horoscope = "Boğa";
            } else System.out.println("Girdiğiniz değer eksik veya yanlış!!!");
            System.out.println("Merhaba, Burcunuz :"+horoscope);
        }
        else if(month == 5){
            if(day<=21 && day>=1){
                horoscope = "Boğa";
            } else if (day>21 && day<=31) {
                horoscope = "İkizler";
            } else System.out.println("Girdiğiniz değer eksik veya yanlış!!!");
            System.out.println("Merhaba, Burcunuz :"+horoscope);
        }
        else if(month == 6){
            if(day<=22 && day>=1){
                horoscope = "İkizler";
            } else if (day>22 && day<=30) {
                horoscope = "Yengeç";
            } else System.out.println("Girdiğiniz değer eksik veya yanlış!!!");
            System.out.println("Merhaba, Burcunuz :"+horoscope);
        }
        else if(month == 7){
            if(day<=22 && day>=1){
                horoscope = "Yengeç";
            } else if (day>22 && day<=31) {
                horoscope = "Aslan";
            } else System.out.println("Girdiğiniz değer eksik veya yanlış!!!");
            System.out.println("Merhaba, Burcunuz :"+horoscope);
        }
        else if(month == 8){
            if(day<=22 && day>=1){
                horoscope = "Aslan";
            } else if (day>22 && day<=31) {
                horoscope = "Başak";
            } else System.out.println("Girdiğiniz değer eksik veya yanlış!!!");
            System.out.println("Merhaba, Burcunuz :"+horoscope);
        }
        else if(month == 9){
            if(day<=22 && day>=1){
                horoscope = "Başak";
            } else if (day>22 && day<=30) {
                horoscope = "Terazi";
            } else System.out.println("Girdiğiniz değer eksik veya yanlış!!!");
            System.out.println("Merhaba, Burcunuz :"+horoscope);
        }
        else if(month == 10){
            if(day<=22 && day>=1){
                horoscope = "Terazi";
            } else if (day>22 && day<=31) {
                horoscope = "Akrep";
            } else System.out.println("Girdiğiniz değer eksik veya yanlış!!!");
            System.out.println("Merhaba, Burcunuz :"+horoscope);
        }
        else if(month == 11){
            if(day<=21 && day>=1){
                horoscope = "Akrep";
            } else if (day>21 && day<=30) {
                horoscope = "Yay";
            } else System.out.println("Girdiğiniz değer eksik veya yanlış!!!");
            System.out.println("Merhaba, Burcunuz :"+horoscope);
        }
        else if(month == 12){
            if(day<=21 && day>=1){
                horoscope = "Yay";
            } else if (day>21 && day<=31) {
                horoscope = "Oğlak";
            } else System.out.println("Girdiğiniz değer eksik veya yanlış!!!");
            System.out.println("Merhaba, Burcunuz :"+horoscope);
        }
        else {
            System.out.println("Girdiğiniz değer eksik veya yanlış!!!");
        }







    }
}