package arrays;

import java.util.Scanner;

public class InsertionSort {

    public static int[] takeinput(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Size?: ");
        int size = scn.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the Element "+i+" : ");
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    /**
     * Insertion sort ma 1st element assume krte hai vo sorted hai.... agar vo next wale se greater hota hai toh
     * largest wale ko right shift kr dete hai.
     * @param arr
     */
    public static void insertionSort(int[] arr){
        for (int counter = 1; counter < arr.length; counter++) {
            int val = arr[counter];
            int j = counter-1;
            while(j > -1 && arr[j] > val){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
        }
        for(int val: arr){
            System.out.print(val+"\t");
        }
    }

    public static void main(String[] args) {
        int[] array = takeinput();
        insertionSort(array);
    }
}
