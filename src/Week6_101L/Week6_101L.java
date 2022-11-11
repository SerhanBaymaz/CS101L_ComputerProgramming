package Week6_101L;

public class Week6_101L {

    //1.QUESTİON
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }


    //2.QUESTİON
    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }


    //3.QUESTİON
    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }


    //4.QUESTİON
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;
        if (num2 < num1 && num2 < num3) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        } else if (num3 < num1 && num3 < num2) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num3 < num2) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println("Sorted Numbers are : "+num1 + ", " + num2 + ", " + num3);
    }


    //5.QUESTİON
    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int f2 = 1;
        if (n == 0) {
            return f0;
        } else if (n == 1) {
            return f1;
        } else if (n == 2) {
            return f2;
        } else {
            System.out.print(f0 + "," + f1 + "," );
            for (int i = 3; i <= n; i++) {
                f0 = f1;
                f1 = f2;
                f2 = f0 + f1;
                System.out.print(f2+",");
            }
            return f2;
        }
    }




    public static void main(String[] args) {

        System.out.println("Pentagol Number is : "+getPentagonalNumber(10));
        System.out.println("Sum of digits : "+sumDigits(123456789));
        System.out.println("Is Palindrome : "+isPalindrome(12321));
        System.out.println("Is Palindrome : "+isPalindrome(12345));
        displaySortedNumbers(3.2, 4.5, 1.2);
        fibonacci(10);
    }
}
