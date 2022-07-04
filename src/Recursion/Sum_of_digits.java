package Recursion;

public class Sum_of_digits {
    public static void main(String[] args) {
        int ans = sumDigits(1342);
        System.out.println(ans);

    }

    static int sumDigits(int n ){
        if(n==0){
            return 0;
        }
        else
            return sumDigits(n/10) + n%10;
    }
}
