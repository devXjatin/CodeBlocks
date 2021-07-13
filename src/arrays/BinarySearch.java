package arrays;

import java.util.Scanner;

public class BinarySearch {
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

    //Binary Search
    public int binarySearch(int[]arr, int item){
        int low = 0;
        int mid;
        int high = arr.length-1;
        while(low <= high){
            mid = (low + high)/2;
            if(arr[mid] < item){
                low = mid+1;
            }
            else if(arr[mid] > item){
                high = mid -1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int [] array = binarySearch.takeinput();
        System.out.println("Enter item you want to search: ");
        int item = binarySearch.scn.nextInt();
        int search = binarySearch.binarySearch(array, item);
        if(search == -1){
            System.out.println("Element is not found");
        }
        else {
            System.out.println("Element found at "+search+" position.");
        }

    }
}
