public class StringPalindromeUsingRecursion {
    public static boolean palin(String str, int start, int end){
        if(start <= end){
            if(str.charAt(start) != str.charAt(end)) return false;
            palin(str, start+1, end-1);
        }
        return true;
    }
    public static void main(String[] args){
        String str = "ABCDCBA";
        System.out.println(palin(str, 0, str.length()-1));
    }
}
