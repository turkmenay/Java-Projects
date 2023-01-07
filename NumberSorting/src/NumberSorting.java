import java.util.Scanner;

public class NumberSorting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Please Enter Different Three Number..");
        System.out.println("First Number :");
        a = sc.nextInt();
        System.out.println("Second Number :");
        b = sc.nextInt();
        System.out.println("Third Number :");
        c = sc.nextInt();

        if(a>b && a>c){
            if(b>c) {
                System.out.println(a+">"+b+">"+c);
            } else if(c>b){
                System.out.println(a+">"+c+">"+b);
            } else System.out.println(a+">"+c+"="+b);
        }
        else if(b>a && b>c){
                if(a>c){
                    System.out.println(b+">"+a+">"+c);
                } else if(c>a){
                    System.out.println(b+">"+c+">"+a);
                }else System.out.println(b+">"+c+"="+a);
            }

        else if(c>a && c>b){
            if(a>b){
                System.out.println(c+">"+a+">"+b);
            }else if(b>a){
                System.out.println(c+">"+b+">"+a);
            }else System.out.println(c+">"+b+"="+a);
        }
        else System.out.println("Please Enter 'DIFFERENT' Values");

        }

    }
