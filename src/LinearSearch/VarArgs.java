package LinearSearch;

import java.util.Arrays;

public class VarArgs {
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
    static void mutiple(int a,int b,String ...v){
        System.out.println(Arrays.toString(v));

    }
    public static void main(String[] args) {
        fun(12,15,56,48,15);
        mutiple(5,6,"aryan","maheshwari");
    }

    }

