package String;

public class removing_a {
    public static void main(String[] args) {
        String str = "ccaad";

        StringBuilder obj = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!='a'){
                obj.append((str.charAt(i)));
            }
        }
        System.out.println(obj);
    }
}

