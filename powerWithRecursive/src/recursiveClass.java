import java.sql.PreparedStatement;
import java.util.Scanner;

public class recursiveClass {

    static int recursiveFunction(int a, int b){
        if(a == 0)
            return 1;

        return b*recursiveFunction((a-1), b);
    }

    public static void main() {
        int result ;
       Scanner input = new Scanner(System.in);

       boolean isTrue = true;
       while(isTrue) {
           int select;
           String menu = "Enter 1 to continue or 2 to exit: ";
           System.out.print(menu);
           select = input.nextInt();

           switch (select){
               case 1:
                   System.out.print("Enter the base value: ");
                   int b = input.nextInt();

                   System.out.print("Enter the power value: ");
                   int a = input.nextInt();

                   result = recursiveFunction(a, b);

                   System.out.println("The result is: " + result);
                   break;
               case 2:
                   isTrue = false;

           }

       }
    }
}
