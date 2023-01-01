import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args){
        String userName, password ;
        Scanner sc =new Scanner(System.in);

        System.out.println("Your UserName : ");
        userName = sc.nextLine();
        System.out.println("Your Password : ");
        password = sc.nextLine();
        if(userName.equals("Java")&&(password.equals("java123"))){
            System.out.println("You've logged in  successfully!");
        }
        else {
            System.out.println("Your login information is wrong!!");
        }

    }
}