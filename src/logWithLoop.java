import java.util.Scanner;

public class logWithLoop {

    static void main() {
        int password;
        boolean isPasswordSuccess = false;

        Scanner input = new Scanner(System.in);

        while(!isPasswordSuccess){
            System.out.print("enter your password: ");
            password = input.nextInt();

            if(password == 123){
                System.out.print("Logged successfully!");
                isPasswordSuccess = true;
            } else{
                System.out.print("Invalid password! try again");
            }
        }
    }
}
