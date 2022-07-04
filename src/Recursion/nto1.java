package Recursion;

public class nto1 {
    public static void main(String[] args) {
        Nto1(5);
        reverse(5);
    }


    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(--n);
    }

    static void Nto1(int n){
        if (n==0){
            return;
        }
        else
            System.out.println(n);
        Nto1(n-1);
    }

    static void reverse(int n){
        if (n==0){
            return;
        }
        else
            reverse(n-1);
        System.out.println(n);

    }
}
