package Bitwise;

public class unique_Number_in_array {
    public static void main(String[] args) {
        int arr[] = {2,3,3,4,2,6,4};
        int ans = unique(arr);
        System.out.println(ans);
    }
    private static int unique(int[]arr){
        int unique = 0;

        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
