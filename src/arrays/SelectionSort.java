package arrays;

import java.util.Scanner;

public class SelectionSort {
    Scanner scn = new Scanner(System.in);
    public int[] takeinput(){
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
     * 1.Find minimum element somehow.
     * suppose minimum 0th index element is minimum and then compare with rest of the element.
     * @param arr
     * @return
     */
    public int[] selectionSort(int[] arr){
        int counter = 0;
        while (counter < arr.length-1){
            int min = counter;
            for (int i = counter+1; i < arr.length; i++) {
                if(arr[i] < arr[min]){
                    min = i;
                }
            }
            int temp = arr[min];
            arr[min] = arr[counter];
            arr[counter] = temp;
            counter++;
        }
        return arr;
    }

    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int[] array = obj.takeinput();
        int[] sortedArray = obj.selectionSort(array);
        for(int val: sortedArray){
            System.out.print(val+"\t");
        }
        System.out.println();
        for(int val: array){
            System.out.print(val+"\t");
        }
    }
}
