import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year, result;
        String horoscope = "";
        System.out.print("Please Enter Your Birth Year : ");
        year = sc.nextInt();

        result = year%12;

        switch (result){
            case 0 :
                horoscope = "Monkey";
                break;
            case 1 :
                horoscope = "Cockerel";
                break;
            case 2 :
                horoscope = "Dog";
                break;
            case 3 :
                horoscope = "Pig";
                break;
            case 4 :
                horoscope = "Mouse";
                break;
            case 5 :
                horoscope = "Bullock";
                break;
            case 6 :
                horoscope = "Tiger";
                break;
            case 7 :
                horoscope = "Rabbit";
                break;
            case 8 :
                horoscope = "Dragon";
                break;
            case 9 :
                horoscope = "Snake";
                break;
            case 10 :
                horoscope = "Horse";
                break;
            case 11 :
                horoscope = "Sheep";
                break;
            default:
        }
        System.out.println("Your Zodiac Horoscope is "+ horoscope);



    }
}

