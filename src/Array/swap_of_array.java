package Array;

import java.util.Arrays;

public class swap_of_array {

    static void swap(int []arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,6,8,9};
        swap(arr,2,3);
        System.out.println(Arrays.toString(arr));

    }
}
