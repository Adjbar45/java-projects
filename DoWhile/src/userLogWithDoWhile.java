import java.util.Scanner;

public class userLogWithDoWhile {
    static void main() {
        Scanner input = new Scanner(System.in);
        int pass;
        boolean askPassword = true;

        do{
            System.out.print("Enter a password: ");
            pass = input.nextInt();

            if(pass == 123){
                System.out.println("Dogru");
                askPassword = false;
            } else{
                System.out.println("Yanlis");
            }
        }while(askPassword);

    }
}
