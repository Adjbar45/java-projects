public class isPalindromClass {

    static boolean isPalindrom(int num){

        int temp = num, reversedNum = 0, lastNumber;

        while(temp != 0){

            lastNumber = temp%10;
            reversedNum = (reversedNum * 10) + lastNumber;
            temp /= 10;
        }

        if(num == reversedNum)
            return true;
        else
            return false;
    }

    static void main() {
        System.out.print(isPalindrom(101));
    }
}
