public class AmstrongNumber {
    public static void main(String[] args){
        int n = 153;
        int len = String.valueOf(n).length();
        int num = n;
        int sum = 0;

        while(n>0){
            int rem = n%10;
            sum += Math.pow(rem,len);
            n = n/10;
        }
        if(sum == num) System.out.println("Amstrong number");
        else System.out.println("Not Amstrong number");
    }
}
