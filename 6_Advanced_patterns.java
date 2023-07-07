//1]
public class july06 {
    public static void floyds_triangle(int n) {
        //outer
        int counter=1;
        for(int i=1; i<=n; i++){
            //inner - No. of times Ciunter printed...
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyds_triangle(4);
    }
}

//2]

public class july06{
    public static void zero_one_triangle(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        zero_one_triangle(5);
    }
}
