package Recursion;

public class number_with_recursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if(n==5){    // Base condition
            return;
        }
        System.out.println(n);
        //recursive call
        //if you are calling a function again and again you can treat it as a separate call in the stack
        print(n+1);// this is tail recursion or last function call
    }
}
