package recursion;

public class RecursionHeadDemo {
    public static void pI(int n){
        if(n == 0){
            return;
        }
        pI(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        pI(5);
    }
}
