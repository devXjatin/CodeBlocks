package recursion;

public class RecursionDemo {
    public static void pD(int n){
        if(n == 0) {
            return;
        }
        System.out.println(n);
        pD(n-1);
    }

    public static void main(String[] args) {
        pD(5);
    }
}
