package Recursion;

public class product_digits {
    public static void main(String[] args) {
        int ans = prod(1234);
        System.out.println(ans);

    }

    static int prod(int n ){
        if(n%10==n){
            return n;
        }
        return  (n%10) * prod(n/10 ) ;
    }
}
