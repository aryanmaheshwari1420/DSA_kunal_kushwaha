package Array;

import java.util.Arrays;

public class SearchIn2darray {

    static int[] searchin2darray(int [][]arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                if (arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};

    }

    public static void main(String[] args) {
        int arr[][] = {
                {12,15,48,26},
                {2,8,5,6},
                {4,63,2,3},
        };
        int ans [] = searchin2darray(arr,5);
        System.out.println(Arrays.toString(ans));

    }
}
