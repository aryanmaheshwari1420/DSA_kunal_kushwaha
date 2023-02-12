package Array;

public class second_largest {
    public static void main(String[] args) {

        int arr[] = {5,2,7,8,3,9};
        int first= Integer.MIN_VALUE; // 9
//        System.out.println(first);
        int second = Integer.MIN_VALUE; // 8
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }
        }
        System.out.println(second);

    }

}
