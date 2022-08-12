package BinarySearch;



 // if(e[mid]> e[mid+1] ===> you are int the descending portion of the array
//       e = mid

// if (e[mid] < e[mid+1] ====> you are int the ascending portion of the array

//    s  = mid







public class peakIndexMountain {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {

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
}
