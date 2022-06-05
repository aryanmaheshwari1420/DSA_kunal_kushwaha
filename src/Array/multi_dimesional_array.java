package Array;

import java.util.Scanner;

public class multi_dimesional_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {
                {2,5,3},
                {5,6},
                {8,6,9,7}
        };
        for (int i=0 ;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}