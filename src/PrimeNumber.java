public class PrimeNumber {
    public static void main(String[] args) {
        int totalPrime=100,flag=0;
        for(int i=2;i<=totalPrime;i++){
            int m=i/2;
            for(int j=2;j<=m;j++){
                if(i%j==0){
                    //System.out.println("not prime"+i);
                    flag=1;
                    break;
                }
                flag=0;
            }
            if(flag==0){
                System.out.println("prime"+i);
            }
        }

    }
}
