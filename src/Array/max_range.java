package Array;

public class max_range {

    static int maxrange(int arr[],int start,int end){
        int max = arr[start];
        for (int i=start ;i<=end;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {2,8,6,5,3,7,6};
        int ans = maxrange(arr,1,6);
        System.out.println(ans);
    }
}
