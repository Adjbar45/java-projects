import java.util.Scanner;

public class fibonacciClass {

    static int fibFun(int num){

        if(num == 1 || num == 2)
            return 1;
        return fibFun(num - 1) + fibFun(num - 2);
    }

    static void main() {
        System.out.print(fibFun(8));
    }
}
