package BinarySearch;

 // ceiling of a number - --> Smallest element in the array greater or = target

public class Ceiling_of_a_number {



    public static void main(String[] args) {

    }

    static  int floor(int arr[] , int target){
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
        return end;
    }
}
