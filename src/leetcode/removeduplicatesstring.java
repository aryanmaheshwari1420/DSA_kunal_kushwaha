package leetcode;

import java.util.Stack;

public class removeduplicatesstring {
    public static void main(String[] args) {
        String s = "bcabc";
        String ans = removeDuplicateLetters(s);
        System.out.println(ans);

    }
    public static String removeDuplicateLetters(String s) {

        Stack<Character> stack = new Stack<>();
        for(char i =0;i<s.length();i++) {
            if (stack.contains(s.charAt(i))) {
                continue;
            } else {
                stack.push(s.charAt(i));
            }
        }
        System.out.println(stack);
        StringBuilder obj = new StringBuilder();
        for(int i =0;i<stack.size();i++){
            obj.append(stack.pop());
        }
        return obj.toString();


    }
}
