package Recursion;
// for loop approch is in string package
public class string_character_removing {
    public static void main(String[] args) {
        skip("", "baaachdaaaaadjfkjskfaajalkjalkjkaalkjalkala");

    }
   // que --> for removing particular character from a string

    // up is the original one
    // p is the empty string
    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }


   // que-- to remove the particular string from a string like baadapplejkj we are going to remove apple in this as a full string

    static String skipapple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            return skipapple(up.substring(5));
        } else {
            return up.charAt(0) + skipapple(up.substring(1));
        }
    }

    static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(5));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}

