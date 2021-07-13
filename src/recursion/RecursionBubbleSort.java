package recursion;

public class RecursionBubbleSort {
    public static void bubbleSort(int[] arr, int index, int length){
        if(length == 0){
            return;
        }
        if(index == length){
            bubbleSort(arr, 0 , length-1);
            return;
        }
        if (arr[index] > arr[index+1]) {
            int temp = arr[index];
            arr[index] = arr[index+1];
            arr[index+1] = temp;
        }
        bubbleSort(arr, index+1, length);

        for (int j : arr) {
            System.out.print(j + "\t");
        }
    }

    public static void main(String[] args) {
        int[] array = {20, 50, 30, 10, 40};
        bubbleSort(array,0, array.length-1);
    }
}
