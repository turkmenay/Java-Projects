import java.util.Base64;
import java.util.Scanner;

public class atmProject {
    public static void main(String[] args) {

        String user, username = "ahmet";
        int pass, password = 1234, trypass = 3;
        int action, count, balance = 6000;
        Scanner value = new Scanner(System.in);
        while (trypass > 0) {
            System.out.print("Enter your username : ");
            user = value.nextLine();
            System.out.print("Enter your password : ");
            pass = value.nextInt();

            if (user.equals(username) && pass == password) {
                do {
                    System.out.println("Welcome to your account!\n" +
                            "1. Para Çekim\n" +
                            "2. Para Yatırma\n" +
                            "3. Bakiye Sorgulama\n" +
                            "4. Şifre değiştirme\n" +
                            "5. Çıkış yap");
                    System.out.print("Please choise your transaction : ");
                    action = value.nextInt();
                    switch (action) {
                        case 1: {
                            System.out.print("Lütfen çekmek istediğiniz tutarı giriniz : ");
                            count = value.nextInt();
                            if (count <= balance) {
                                System.out.println(count + " $ Tutarında Para Çektiniz!\n" +
                                        "New Balance : " + (balance - count) + " $");
                                balance -= count;
                            } else {
                                System.out.println("Yeterli bakiyeniz yoktur!");
                            }
                        }
                        break;
                        case 2: {
                            System.out.println("Lütfen yatırmak istediğiniz tutarı giriniz : ");
                            count = value.nextInt();
                            System.out.println(count + " $ hesabınıza yatırılmıştır!\n" +
                                    "New Balance : " + (balance + count) + " $");
                            balance += count;
                        }
                        break;
                        case 3: {
                            System.out.println("Hesabınızın Bakiyesi : " + balance + " $");
                        }
                        break;
                        case 4: {
                            System.out.println("Lütfen mevcut şifrenizi giriniz : ");
                            pass = value.nextInt();
                            if (pass == password) {
                                System.out.println("Lütfen yeni şifrenizi giriniz : ");
                                pass = value.nextInt();
                                password = pass;
                                System.out.print("Yeni şifreniz : " + pass);
                            } else {
                                System.out.println("Yanlış şifre girdiniz !!");
                            }
                        }
                    }
                }
                while (action != 5);
                System.out.println("Tekrar görüşmek üzere...");
            } else {
                trypass--;
                System.out.println("Hatalı kullanıcı adı veya şifresi!");
                if (trypass == 0) {
                    System.out.println("Hesabınıza bloke konulmuştur. Lütfen Banka personeliyle iletişime geçiniz!!!");
                } else {
                    System.out.println("kalan hakkınız : " + trypass);
                }
            }
        }
    }
}