import java.util.Scanner;

public class ortalamaHesaplamasiClass {

        static void main() {
            int mat, fizik, turkce, kimya, muzik;

            Scanner input = new Scanner(System.in);

            System.out.print("Matematik notunuz giriniz: ");
            mat = input.nextInt();

            System.out.print("Fizik notunuz giriniz: ");
            fizik = input.nextInt();

            System.out.print("turkce notunuz giriniz: ");
            turkce = input.nextInt();

            System.out.print("kimya notunuz giriniz: ");
            kimya = input.nextInt();

            System.out.print("muzik notunuz giriniz: ");
            muzik = input.nextInt();

            double avg = (mat + fizik + turkce + kimya + muzik)/5;

            if (avg >= 55) {
                System.out.println("Tebrikler sinifa gectiniz: ");
            } else{
                System.out.println("Sinifa kaldiniz seneye tekrar gorusmek uzere!");
            }
            System.out.print("Ortalamaniz: "+ avg);


        }

}

