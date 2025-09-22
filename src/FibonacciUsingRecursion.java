public class FibonacciUsingRecursion {
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        int last = fib(n-1);
        int slast = fib(n-2);
        return last + slast;
    }
    public static void main(String[] args){
        int n=5;
        for(int i=0; i<=n; i++){
            System.out.println(fib(i) + " ");
        }

    }
}
