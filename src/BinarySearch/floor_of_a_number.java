package BinarySearch;


 //  floor = greater number smallest or  = target

public class floor_of_a_number {
    public static void main(String[] args) {

    }

    static  int CeilingNumber(int arr[] , int target){
        // but what if the target is greater than the greatest number in the array
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        while (start<=end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                return  mid;
            }
            else if(target<arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid +1;
            }
        }
        return start;
    }



}
