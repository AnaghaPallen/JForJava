public class CheckPalindrome {
    public static void main(String[] args){

        int num = 4;
        int rev = 0;
        int n = num;

        while(n != 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n/10;
        }

        if(rev == num) System.out.println("True");
        else System.out.println("False");
    }
}
