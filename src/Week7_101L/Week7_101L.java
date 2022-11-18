package Week7_101L;

public class Week7_101L {


    //1. Write a java method to display the middle character of a string
    public static void middleChar(String str){
        int lenght = str.length();
        if (lenght==0){
            System.out.println("There is no char in the given String");
        }
        else if (lenght%2==0){
            System.out.println("[Given string is : "+str+"] Middle char's are : "+str.substring((lenght/2)-1,(lenght/2)+1));
        }else{
            System.out.println("[Given string is : "+str+"] Middle char  is   : "+str.substring((lenght/2),(lenght/2)+1));
        }
    }







    public static void main(String[] args) {
        System.out.println("***************************OUTPUT***************************");


        middleChar("Serhan");
        middleChar("Ahmet");
        middleChar("12345678");
        middleChar("");




        System.out.println("***************************OUTPUT***************************");

    }
}
