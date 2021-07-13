package arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        //declare
        int[] arr = null;
        System.out.println(arr);

        // allocate space
        arr = new int[5];
        System.out.println(arr);

        // get the value
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // set the value
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // get the value
        for (int j : arr) {     // enhanced for loop
            System.out.println(j);
        }

    }
}
