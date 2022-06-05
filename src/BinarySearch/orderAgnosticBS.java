package BinarySearch;

public class orderAgnosticBS {

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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

    public static void main(String[] args) {
//        int arr[] = {1,2,4,6,8,10,14,16,18};
        int arr[] = {99,52,42,22,21,13,8,7,6,2,1};
        int ans  = orderAgnosticBS(arr,6);
        System.out.println(ans);

    }
}
