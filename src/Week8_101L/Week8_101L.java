package Week8_101L;

public class Week8_101L {

    //1. Write a method that displays the given array
    public static void displayArr(int arr[]){
        System.out.print("["+ arr[0]+ ", ");
        for (int i = 1; i < arr.length-1; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.print(arr[arr.length-1]+ "]");

    }





    public static void main(String[] args) {

        //Q1
        int[] myArray = {1,8,9,6,2,3,5,4,7,8,6,8,8,9};
        displayArr(myArray);







    }
}
