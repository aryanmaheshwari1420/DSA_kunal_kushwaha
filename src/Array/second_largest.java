package Array;

public class second_largest {
    public static void main(String[] args) {

        int arr[] = {5,2,7,8,3,9};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
        }
        System.out.println(max);
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==max){
                continue;
            }else {
                ans = Math.max(ans,arr[i]);
            }
        }
        int third_largest =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!= max && arr[i]!=ans){
                third_largest = Math.max(third_largest,arr[i]);
            }
        }
        System.out.println(third_largest);

    }

}
