package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class PassinginFunctions {

    static void change(int []ar){
        ar[0]= 99;
    }

    public static void main(String[] args) {
        int arr[] = {5,4,15,20};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
}
