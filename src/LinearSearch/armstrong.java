package LinearSearch;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem,cube;
        int sum=0;
        int temp = n;
        while(n!=0){
             rem = n % 10;
             cube = rem*rem*rem;
             sum+=cube;
             n = n/10;
        }
        if (sum==temp){
            System.out.println("armstrong");
        }
        else {
            System.out.println("not armstrong");
        }
    }
}
