package Bitwise;

public class odd_even {
    public static void main(String[] args) {
        int n = 67;
        int temp = n;
        System.out.println(isOdd(n));

    }
    private static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
