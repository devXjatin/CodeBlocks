package arrays;

import java.util.Scanner;

public class ArrayOperation {
    final static Scanner scn = new Scanner(System.in);

    //take input from the user
    public static int[] takeInput(){
        System.out.println("Size?: ");
        int size = scn.nextInt();

        //declaration of array
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value for "+i+" index: ");
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    //to diplay the value
    public void display(int[] arr){
        for(int val : arr){
            System.out.println(val);
        }
    }

    // find maximum value in the array
    public int maxArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    // Linear search in the array
    public int linearSearch(int[] arr, int item){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == item){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayOperation obj = new ArrayOperation();
        int[] array = takeInput();
        obj.display(array);
        System.out.println("Maximum in the array: "+obj.maxArray(array));
        System.out.println(obj.linearSearch(array, 30));

    }
}
