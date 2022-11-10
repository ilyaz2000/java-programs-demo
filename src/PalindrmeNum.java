public class PalindrmeNum {
    public static void main(String[] args) {
        int a=343;
        int t=a;
        int n=0;
        while(a>0){
            int rem=a%10;
            System.out.println(rem);
            n=n*10+rem;
            System.out.println(n);
            a=a/10;

        }
        if(t==n){
            System.out.println("p");
        }
        else {
            System.out.println("np"+n);
        }
    }
}
