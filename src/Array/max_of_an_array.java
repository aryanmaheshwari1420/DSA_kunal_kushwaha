package Array;

public class max_of_an_array {

    static  int max(int[] arr){
        int maximum  = arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>maximum){
                maximum = arr[i];
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        int arr[] = {2,8,6,5,7,3};
        System.out.println("The maximum in an arrya is:--->"+max(arr));
    }
}