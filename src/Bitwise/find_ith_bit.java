package Bitwise;

public class find_ith_bit {
    public static void main(String[] args) {
        int n = 366;
        int ans = find_ith(n);
        System.out.println(ans);
    }
    private static int find_ith(int n){
        int temp = n & ( 1 << n-1 );
        return temp;
    }
}

//que-> find ith bit in a no

//        987654321  - index
//        101101110  - bits

//        10110110
//        00010000   - mask and perform and operation
//      ------------
//        00010000

//        but how to create mask the logic is given below
//        formula -->   1 << n-1 for the 10000

