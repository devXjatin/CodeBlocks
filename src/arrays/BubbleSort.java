package arrays;

import java.util.Scanner;

public class BubbleSort {
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
    public int[] bubbleSort(int[] arr){
        int counter = 0;
        while (counter < arr.length-1){
            for (int i = 0; i < arr.length -1 - counter; i++) {
                if(arr[i]> arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            counter++;
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int [] array = bubbleSort.takeinput();
        int [] sortedArray = bubbleSort.bubbleSort(array);
        for(int val: sortedArray){
            System.out.print(val+"\t");
        }
    }
}
