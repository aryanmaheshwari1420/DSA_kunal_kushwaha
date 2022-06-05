package LinearSearch;

public class linearsearch_ofstring {

    static boolean Stringsearch(String str,char target){
        if (str.length()==0){
            return false;
        }
        for(char ch:str.toCharArray()){
            if (ch==target){
                return true;
            }

        }
        return false;
    }


    public static void main(String[] args) {
        String name = "Aryan";
        char target = 'c';
        System.out.println(Stringsearch(name,'c'));


    }
}
