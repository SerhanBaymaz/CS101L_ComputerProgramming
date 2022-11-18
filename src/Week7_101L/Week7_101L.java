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


    //2. Write a method to count all vowels in a string
    public static int countVowels(String str){
        String str1 = str.toUpperCase();
        int result =0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) =='A' || str1.charAt(i) =='E' ||str1.charAt(i) =='I' ||str1.charAt(i) =='O' ||str1.charAt(i) =='U' ||str1.charAt(i) =='İ')
                result++;
        }

        return result;
    }


    //3. Write a method to count all words in a string
    public static int countWords(String str){
        int word =0;
        for (int i = 0; i <str.length()-1 ; i++) {
            if (str.charAt(i) == ' '){
                word++;
            }
        }
        return word+1;
    }


    //4. Write a method to check whether an entered string is a valid password
    //a . Password must have at least eight characters
    //b . Password must consist of only letters and digit
    public static boolean isValid(String str){
        boolean result = true;
        if (str.length() >= 8){
            for (int i = 0; i <str.length(); i++) {
                if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i))){
                    return false;
                }
            }
            return true;
        }else{//if length<8
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println("***************************OUTPUT***************************");

        System.out.println("-------------------------------------------------------------------------------------");
        middleChar("Serhan");
        middleChar("Ahmet");
        middleChar("12345678");
        middleChar("");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println();


        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("There are '"+countVowels("Serhan Baymaz I İ ı i") +"' vowels in given String.");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println();


        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("There are '"+countWords("Serhan Baymaz 123 abc")+"' words in given String.");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println();


        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Is your password valid : "+isValid("SerhanBaymaz12"));
        System.out.println("Is your password valid : "+isValid("SerhanBaymaz12*"));
        System.out.println("Is your password valid : "+isValid("S"));
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println();



        System.out.println("***************************OUTPUT***************************");

    }
}
