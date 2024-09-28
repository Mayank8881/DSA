public class palindrom {
    public static void main(String[] args) {
        String str="absnba";
        boolean x=isPalindrom(str);
        System.out.println(x);
    }

    static boolean isPalindrom(String str){
        int i=0;
        int j=str.length()-1;
        if(str.length()==0){
            return true;
        }
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
