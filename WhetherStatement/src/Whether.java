import java.util.Scanner;

public class Whether {
    public static void main(String[] args){
        int heat;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter heat value : ");
        heat = sc.nextInt();
        if(heat<5){
            System.out.println("Go Skiing!");
        }
        else if (heat>=5 && heat<15) {
            System.out.println("Go To Movies!");
        }
        else if (heat>=15 && heat<25){
            System.out.println("Go To Picnic!");
        }
        else System.out.println("Go Swimming!");
    }
}