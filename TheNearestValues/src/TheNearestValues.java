import java.util.Scanner;
import  java.util.Arrays;

public class TheNearestValues {
    public static void main(String[] args) {
        int[] arr = {-300, -100, -50, -5, 0, 5, 10, 15, 25, 100, 50, 200, 300};
        int[] resultNear = new int[arr.length];
        Arrays.sort(arr);
        int near1, near2,negGap,pozGap;
        int nearest1 = -1 * (arr[0]);
        int nearest2 = -1 * (arr[0]);

        Scanner inp = new Scanner(System.in);
        System.out.print("Please insert a number between of " + arr[0] + " and " + arr[arr.length - 1] + " : ");
        int value = inp.nextInt();

        for (int i=0; i<arr.length; i++) {
                near1 = arr[i] - value;
                resultNear[i] = near1;
            }
        for (int a=0; a<resultNear.length;a++) {
            if(resultNear[a]<0){
                nearest1=a;
            }else{
                nearest2=a;
            break;}
        }
        System.out.println("Your value that you input is between of "+arr[nearest1]+" && "+arr[nearest2]);
        }
    }
