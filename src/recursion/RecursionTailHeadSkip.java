package recursion;

public class RecursionTailHeadSkip {
    public static void pDI(int n){
        if(n == 0){
            return;
        }
        if(n %2 != 0){
            System.out.println(n);
        }
        pDI(n-1);
        if(n %2 == 0)
            System.out.println(n);
    }

    public static void main(String[] args) {
        pDI(5);
    }
}
