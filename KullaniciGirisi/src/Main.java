import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;
        Scanner scan=new Scanner(System.in);

        System.out.print("Kullanıcı Adanız : ");
        username=scan.nextLine();

        System.out.print("Şifre : ");
        password=scan.nextLine();

        if(username.equals("patika")&&password.equals("java101")){
            System.out.println(" Giriş Yapıldı. ");
        }else {
            System.out.println("Hatalı Giriş!!!");
        }
    }
}