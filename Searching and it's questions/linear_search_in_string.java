public class linear_search_in_string {
    public static void main(String[] args) {
        String str="pawan";
        char target='j';
        System.out.println(linear_search(str,target));

    }
    public static boolean linear_search(String str,char target){
        if(str.length()==0){
            return false;
        }

        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)==target){
        //         return true;
        //     }
        // }

// if you want to use the ehanced for each loop.
// here the toCharArray() is the function to convert the string into the character array.
        for(char ch:str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}
