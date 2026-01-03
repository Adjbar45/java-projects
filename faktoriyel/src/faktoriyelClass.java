import java.util.Scanner;

public class faktoriyelClass {

    static void main() {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        n = input.nextInt();
        int i;
        for(i = 1; i <= n; i++){

            i *=i;
        }
        System.out.print(i);
    }
}
