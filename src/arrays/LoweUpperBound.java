package arrays;

import java.util.Scanner;

public class LoweUpperBound {
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
     * Lower Bound of the sorted array
     */
    public int lowerBound(int[] arr, int data){
        int low = 0, high = arr.length-1;
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == data){
                ans = mid;
                high = mid-1;
            }
            else if(arr[mid] < data){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return ans;
    }

    /**
     * Upper bound of the element
     * @param arr
     */
    public int upperBound(int[] arr, int data){
        int low = 0, high = arr.length-1;
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == data){
                ans = mid;
                low = mid+1;
            }
            else if(arr[mid] < data){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        LoweUpperBound loweUpperBound = new LoweUpperBound();
        int[] array = takeinput();
        SelectionSort selectionSort = new SelectionSort();
        int[] sortedArray = selectionSort.selectionSort(array);
        System.out.println("Enter the number you want to found?: ");
        int data = scn.nextInt();
        System.out.println(loweUpperBound.lowerBound(sortedArray, data));
        System.out.println(loweUpperBound.upperBound(sortedArray, data));
    }
}
