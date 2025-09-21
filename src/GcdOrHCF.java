public class GcdOrHCF {
    public static void main(String[] args){
        int n1 = 9, n2 = 12;

        while(n1>0 && n2>0){
            if(n1>n2)
                n1 = n1 % n2;
            else
                n2 = n2 % n1;
        }

        if(n1 == 0)
            System.out.println("GCD is: "+n2);
        else System.out.println("GCD is: "+n2);
    }
}
