import java.util.Scanner;

public class evenWordClass {
    static void main() {
        int say;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        say = input.nextInt();

        while(say > 1){

            if(say%2 == 0){
                System.out.println(say);
            }
            say--;
        }
    }
}
