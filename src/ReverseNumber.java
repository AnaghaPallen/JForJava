public class ReverseNumber {
    public static void main(String[] args){

        long n = -938543;

        String reverse = new StringBuilder().append(Math.abs(n)).reverse().toString();
        long reversed = n < 0? Long.parseLong(reverse) * -1 : Long.parseLong(reverse);

        System.out.println(reversed);
    }
}
