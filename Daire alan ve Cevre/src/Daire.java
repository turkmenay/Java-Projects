import java.util.Scanner;
public class Daire{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("This Programme provides circle calculations (area, circumference etc.)");
        //Variables
        double pi = 3.14, alfa, radius, circum, area, slice;
        System.out.println("please enter radius of circle :");
        radius = sc.nextDouble();
        area = pi * (radius*radius);
        circum = 2*pi*radius;
        System.out.println("Area of your circle is "+area);
        System.out.println("Circumference of your circle is "+circum);
        System.out.println("Please enter your center angel : ");
        alfa = sc.nextDouble();
        slice = (area*alfa)/360;
        System.out.println("Your slice area is "+slice);
    }
}