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
        double pi1 = 4*afterThe4TimesPart1;
        System.out.println(pi1);


        double afterThe4TimesPart2 = 0;
        double m = 1;
        for (int i = 1; i <5 ; i++) {
            afterThe4TimesPart2 = afterThe4TimesPart2 + (2/(m*(m+2)));
            m = m+4;
        }
        double pi2 = 4*afterThe4TimesPart2;
        System.out.println(pi2);




          /*
            4. Write a program that displays the area and perimeter of a circle that has a radius of 5.5
            using the π you have calculated in question 3
          */
        double radius = 5.5;
        double area = pi2*radius*radius;
        System.out.println(area);
        System.out.println(2*radius);



          /*
                          You can use Cramer’s rule to solve the following 2x2 system of linear equation:
                𝑎𝑥 + 𝑏𝑦 = 𝑒
                𝑐𝑥 + 𝑑𝑦 = 𝑓
                𝑥 =𝑒𝑑 − 𝑏𝑓  /  𝑎𝑑 − 𝑏𝑐
                𝑦 = 𝑎𝑓 − 𝑒𝑐 /  𝑎𝑑 − 𝑏𝑐

                Write a program that solves the following equation and display the value for x and y. Then
                calculate e and f by using the x and y.
                3.4𝑥 + 50.2𝑦 = 44.5
                2.1𝑥 + .55𝑦 = 5.9
           */
        double a = 3.4;
        double b = 50.2;
        double e = 44.5;

        double c = 2.1;
        double d = 0.55;
        double f = 5.9;

        double x=((e*d)-(b*f)) / ((a*d)-(b*c));
        double y=((a*f)-(e*c)) / ((a*d)-(b*c));

        System.out.println(x);
        System.out.println(y);




    }
}
