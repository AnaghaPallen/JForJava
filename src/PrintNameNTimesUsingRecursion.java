public class PrintNameNTimesUsingRecursion {
    public static void print(int n){
        if(n == 0) return;
        System.out.println("Anagha ");
        n--;
        print(n);
    }
    public static void printNumbers(int i, int n){
        if(i>n) return;
        System.out.println(i);
        i++;
        printNumbers(i,n);
    }

    public static void main(String[] args){
        int i=1, n=5;
        printNumbers(i,n);
        //print(n);
    }
}
