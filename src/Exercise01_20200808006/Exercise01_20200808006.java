package Exercise01_20200808006;

public class Exercise01_20200808006 {

    public static void main(String[] args) {

            /*
            1. Write a program that displays the following table on console:
            a a^2 a^3
            1 1 1
            2 4 8
            3 9 27
            4 16 64
            */
        System.out.println("a    a^2    a^3");
        for (int a = 1; a <5 ; a++) {
            System.out.println(a+"    "+(a*a)+"    "+(+a*a*a));
        }



    }
}
