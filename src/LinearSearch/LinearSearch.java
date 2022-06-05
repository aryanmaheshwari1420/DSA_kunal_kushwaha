package LinearSearch;
import java.util.*;
public class LinearSearch {


    static int linearsearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }


        for(int i=0;i<arr.length;i++){
            int  element = arr[i];
            if (element == target){
                return i;
            }

        }
         return -1;

    }

    public static void main(String[] args) {
        int arr[] = {20,25,45,26,55};
        int ans= linearsearch(arr,26);
        System.out.println(ans);

    }
}
