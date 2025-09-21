public class CheckPrime {
    public static void main(String[] args){
        int n = 6;
        int count = 0;

        for(int i=1; i<=n/2; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count == 1){
            System.out.println("Prime");
        } else System.out.println("Non-Prime");

    }
}
