package LinearSearch;

public class leet_code__even_no_of_digits {

    static int findNumbers(int[] nums){
        int count=0;
        for (int num:nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
  //
    static boolean even(int num) {
        int no_of_digits = digits(num);
        if (no_of_digits%2==0){
            return true;
        }
        else
            return false;
    }

   static int  digits(int num){
        int count = 0;
        while (num!=0){
            num = num/10;
            count++;
        }
        return count;
   }






    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
