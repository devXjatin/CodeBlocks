package recursion;

public class RecursionArraySorted {
    public static boolean isSorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        else{
            if(arr[index] > arr[index+1]){
                return false;
            }
            else{
                return isSorted(arr,index+1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,7,9};
        System.out.println(isSorted(arr, 0));
    }
}
