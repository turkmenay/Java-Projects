import java.util.Scanner;
public class bodyMassIndex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Variables
        double height, weight, index;
        System.out.println("This programme provides calculating your body-mass index.");
        System.out.print("Please enter your Height as meter : ");
        height = sc.nextDouble();
        System.out.print("Please enter your Weight as kilogram : ");
        weight = sc.nextDouble();
        index = weight/(height*height);
        System.out.print("Your Body-Mass Index is "+index);
    }
}