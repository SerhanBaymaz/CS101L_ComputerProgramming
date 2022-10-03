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



           /*
           2. Write a program that displays the result of:
                    (9.5 𝑥 4.5 − 2.5 𝑥 3) /  (45.5 − 3.5)
            */
        double nominator = (9.5*4.5)-(3*2.5);
        double denominator = (45.5 - 3.5);
        double result = nominator/denominator;
        System.out.println(result);



           /*
           3. π can be computed using the following formula:
                𝜋 = 4 𝑥 (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 ...)

                Write a program that displays the result of ;
                4 𝑥 (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)  and 4 𝑥 (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)
            */
            double afterThe4TimesPart1 = 0;
            double n = 1;
        for (int i = 1; i <4 ; i++) {
            afterThe4TimesPart1 = afterThe4TimesPart1 + (2/(n*(n+2)));
                n = n+4;
        }
        System.out.println(4*afterThe4TimesPart1);


        double afterThe4TimesPart2 = 0;
        double m = 1;
        for (int i = 1; i <5 ; i++) {
            afterThe4TimesPart2 = afterThe4TimesPart2 + (2/(m*(m+2)));
            m = m+4;
        }
        System.out.println(4*afterThe4TimesPart2);




    }
}
