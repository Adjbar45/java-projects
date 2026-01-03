import java.util.Scanner;

public class powerOfTwoClass {

    static void main() {

        int n;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = input.nextInt();

        for(int i = 1; i <= n; i*=2){
            System.out.println(i);
        }
    }
}
