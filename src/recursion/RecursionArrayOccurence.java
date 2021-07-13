package recursion;

public class RecursionArrayOccurence {
    public static int firstIndex(int[] arr, int index, int data){
    //int index = 0;
    if(index == arr.length-1){
            return -1;      // when the index of the element does not found return -1.
        }
        else{
            if(arr[index] == data){
                return index;
            }
            else{
                return firstIndex(arr, index+1,1);
            }
        }
    }

    public static int lastIndex(int[] arr, int index, int data){
        if(index == arr.length-1){
            return -1;
        }
        int i = lastIndex(arr, index+1, data);
        if(i == -1){
            if(arr[index] == data){
                return index;
            }
            else{
                return -1;
            }

        }
        else return i;
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 1, 1, 8, 3};
        System.out.println(firstIndex(arr,0, 1));
        System.out.println(lastIndex(arr, 0, 1));

    }
}
