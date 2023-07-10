//1]

public class july08{
    public static int multiply(int a, int b){
        int product =a*b;
        return product;
    }
    public static int factorial(int n) {
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    public static int bin_coef(int n,int r){
        int fact_n= factorial(n);
        int fact_r = factorial(r);
        int fact_nmr=factorial(n-r);
        
        int binCoeff= fact_n/(fact_r * fact_nmr);
        return binCoeff;

    }
        
    
    public static void main(String[] args) {
       // System.out.println(factorial(4));
       System.out.println(bin_coef(05, 2));
        
    }
}



//2]

public class july08{
    public static boolean isPrime(int n){

//OR
        // for(int i=2; i<=n-1; i++){
        //     if(n%i==0){
        //         return false;
        //      }
        //   }
        //   return

        if(n==2){
            return true;
        }
        boolean isPrime =true;
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }
}

//OR [ OPTIMIZED using Sq ROOT]


public class july08{

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(50));
    }
}
