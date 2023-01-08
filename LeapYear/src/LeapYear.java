import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year, result;
        System.out.print("please enter number of a year(as 1990) : ");
        year = sc.nextInt();
        result = year%4;

        if (result==0){
            System.out.println(year+" is a leap year.");
        }else {
            System.out.println(year+" is NOT a leap year.");
        }
    }
}