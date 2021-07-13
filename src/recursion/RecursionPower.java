package recursion;

public class RecursionPower {
    public static int power(int x, int pow){
        if(pow == 0){
            return 1;
        }
        return x * power(x, pow-1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
