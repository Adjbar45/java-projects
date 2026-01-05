
import java.util.Scanner;

public class calculatorClass {

    static void sum(int a, int b){
        int result = a + b;
        System.out.println(result);
    }

    static void subtraction(int a, int b){
        int result = a - b;
        System.out.println(result);
    }

    static void devid(int a, int b){
        int result = a/b;

        System.out.println("Devision result: " + result);
    }

    static void power(int a, int b){
        int result = 1;
        for(int i = 1; i <= b; i++){
            result *= a;
        }
        System.out.println(result);
    }

    static void multiplication(int a, int b){
        int result = a * b;
        System.out.println("multiplication result: " + result);
    }

    static void remainder(int a, int b){
        int result = a%b;

        System.out.println("remainder result: "+result);
    }

    static void rectangle(int a, int b){

        System.out.println("rectangle cevre: " + 2*( a + b));
        System.out.println("rectangle area: "+ (a * b));
    }


    public static void main() {
        Scanner scan = new Scanner(System.in);

        int select;

        String menu = "1- Toplama isleme\n"
                    + "2- cikarma isleme\n"
                    + "3- bolme isleme\n"
                    + "4- Ust sayi hesaplama \n"
                    + "5- carpma islemi\n"
                    + "6- Mod alma\n"
                    + "7- Dikfortgen Alan ve Cevre Hesabi\n"
                    + "0- Cikis Yap\n";

        while(true){
            System.out.println(menu);



            System.out.print("Select an option from the menu: ");
            select = scan.nextInt();
            if(select == 0)
                break;

            System.out.print("Enter the first number: ");
            int a = scan.nextInt();

            System.out.print("Enter the Second number: ");
            int b = scan.nextInt();

            switch (select){

                case 1:
                    sum(a, b);
                    break;

                case 2:
                    subtraction(a, b);
                    break;
                case 3:
                    devid(a,b);
                    break;
                case 4:
                    power(a,b);
                    break;
                case 5:
                    multiplication(a, b);
                    break;
                case 6:
                    remainder(a, b);
                    break;
                case 7:
                    rectangle(a, b);
                    break;
                default:
                    System.out.print("Invalid number! please select from the menu: ");
            }

        }
    }
}
