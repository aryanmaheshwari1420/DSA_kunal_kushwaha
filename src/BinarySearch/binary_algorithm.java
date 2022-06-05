package BinarySearch;

public class binary_algorithm {


    static int binarysearch(int arr[],int target){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
//            int mid = (start - end)/2; // might be possible that (start - end
            int mid = start + (end - start)/2;

            if (target<arr[mid]){
                end = mid-1;
            }
            else if (target>arr[mid]){
                start = mid+1;
            }
            else{
                //ans found
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,4,3,8,10,14,16};
        int ans = binarysearch(arr,14);
        System.out.println(ans);
    }
}
