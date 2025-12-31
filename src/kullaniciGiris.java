import java.util.Scanner;

public class kullaniciGiris {

    static void main() {
        String userName, passWord;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici adinizi giriniz: ");
        userName = input.nextLine();

        System.out.print("Sifrenizi giriniz: ");
        passWord =input.nextLine();

        if(userName.equals("ajbar") && passWord.equals("java123")){
            System.out.println("Giris Yaptiniz!");
        } else{
            System.out.println("Bilgileriniz yanlis !");
        }

    }
}
