import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, kimya, fizik, muzik, resim;
        double result, avarage = 0 ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Math Point(0-100) : ");
        mat = sc.nextInt();
        if(mat<=100 && mat>=0){
            avarage += mat ;
        }
        else avarage = avarage;
        System.out.println("Please Enter Chemical Point(0-100) : ");
        kimya = sc.nextInt();
        if(kimya<=100 && kimya>=0){
            avarage += kimya ;
        }
        else avarage = avarage;
        System.out.println("Please Enter Physical Point(0-100) : ");
        fizik = sc.nextInt();
        if(fizik<=100 && fizik>=0){
            avarage += fizik;
        }
        else avarage = avarage;
        System.out.println("Please Enter Music Point(0-100) : ");
        muzik = sc.nextInt();
        if(muzik<=100 && muzik>=0){
            avarage += muzik;
        }
        else avarage = avarage;
        System.out.println("Please Enter Drawing Point(0-100) : ");
        resim = sc.nextInt();
        if(resim<=100 && resim>=0){
            avarage += resim;
        }
        else avarage = avarage;

        result = avarage/5;
        if (result >= 55)
            System.out.println("Congratulations! You passed the class!");
        else
            System.out.println("You can't pass the Class!");
        System.out.println("Your avarage is "+result);
    }
}