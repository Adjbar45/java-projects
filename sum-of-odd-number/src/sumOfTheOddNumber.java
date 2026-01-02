import java.util.Scanner;

public class sumOfTheOddNumber {
    static void main() {
        int num;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = input.nextInt();

        for(int i = 1; i <= num; i++){

            if(i % 2 == 1){
                sum += i;
            }

        }
        System.out.print(sum);

    }
}
