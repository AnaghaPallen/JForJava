public class CountDigits {
    public static void main(String[] args){

        int n = 123456789;
        //int count = 0;

        /*while(n>0){
            count++;
            n = n/10;
        }*/
        int count = (int) Math.log10(n) + 1;

        System.out.println(count);
    }
}
