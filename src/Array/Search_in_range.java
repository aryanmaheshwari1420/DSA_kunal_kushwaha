package Array;

public class Search_in_range {

    static int searchinrange(int []arr,int startindex,int endindex,int target){

        for(int i=startindex;i<endindex;i++){
            int element = arr[i];
            if (element==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {18,12,-7,3,14,28};
        int ans = searchinrange(arr,1,4,-7);
        System.out.println(ans);

    }
}
