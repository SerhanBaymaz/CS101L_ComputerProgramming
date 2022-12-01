package Week8_101L;

public class Week8_101L {

    //1. Write a method that displays the given array
    public static void displayArr(int arr[]){
        System.out.print("["+ arr[0]+ ", ");
        for (int i = 1; i < arr.length-1; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println(arr[arr.length-1]+ "]");

    }


    //2. Write a method that generates and returns an array of random numbers between given
    //minimum and maximum values with given length
    public static int[] generateArr(int min, int max, int lenght){
        int[] returnArr = new int[lenght];
        int range = max-min+1;
        for (int i = 0; i <lenght ; i++) {
            returnArr[i] = min+ (int)(Math.random()*range);
        }
        return returnArr;
    }






    public static void main(String[] args) {

        //Q1
        int[] myArray = {1,8,9,6,2,3,5,4,7,8,6,8,8,9};
        displayArr(myArray);

        //Q2
        displayArr(generateArr(10,36,50));











    }
}
