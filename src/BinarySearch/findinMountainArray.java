package BinarySearch;

public class findinMountainArray {
    public static void main(String[] args) {

    }

    static int  search(int[] arr , int target){

        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return  orderAgnosticBS(arr,target,peak+1,arr.length-1);

    }
    public  static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid  = start + (end - start)/2;
            if(arr[mid]>arr[mid+1]){
                // you are in the decreasing portion of the array
                // might be the possible ans , but look at the left
                end = mid;
            }else {
                // you are in ascending portion of the array
                start  = mid +1; // because we know that mid +1 element > mid element
            }
        }
        // in the end start and end pointer pointing to the largest number
        return start ; // or end  you can because both pointing to the largest element;
    }

    static int orderAgnosticBS(int[] arr, int target, int start , int end) {

        // find whether the array is in ascending or descending order
        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }
        while (start <= end) {
//            int mid = (start - end)/2; // might be possible that (start - end
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
