package Recursion;
//
//input = 1824
//output = 4281
//
//1824--> 4 + f(182)
//              2 + f(18)
//                    8 + f(1)



public class Reverse_a_number {
    public static void main(String[] args) {
        rev1(1234);
        System.out.println(sum);

    }
    static int sum = 0; // this is not good because we take it outside the function
    static void rev1(int n){
        if(n==0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n/10);
    }

    //sometimes you might need some additional variables in the argument
    // in that case, make another function
    static int rev2(int n){
        int digits = (int)(Math.log10(n)+1);
        return helper(n, digits);
        
    }

    private static int helper(int n, int digits) {
        if(n%10==n){
            return n;
        }
        int rem = n %10;
        return  rem * (int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }


}
