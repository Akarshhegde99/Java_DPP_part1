 //1

public class july13 {
    public static void reverse(int numbers[]) {
        int first =0, last=numbers.length-1;

        while(first<last){
            //swap
            int temp =numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};

        reverse(numbers);

    //print
    System.out.println("\nREVERSED ARRAY : \n");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        
        System.out.println();
    }
}


//2

import java.util.*;

public class july13{
    public static void printPairs(int numbers[]) {
           int tp=0;
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];  //2,4,6,8,10
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+curr+","+numbers[j]+")");
                   tp++;  //tp =(n(n-1))/2   FORMULA n - elements
            }
            System.out.println();
        }
                  System.out.println(" Total Pairs : "+tp);
    }
    public static void main(String[] args) {
        System.out.println("\n PAIRS IN ARRAY : \n");
        int numbers[] = {2,4,6,8,10};
        printPairs(numbers);
    }
    
}

//3

public class july13{
    public static void printSubarrays(int numbers[]) {
        int ts =0; //Ts = sum(n) = n(n+1)/2
        for(int i=0; i<numbers.length; i++){
            int start=i;
            for(int j=i; j<numbers.length; j++){
                int end =j;
                for(int k=start; k<=end; k++){//print subarray
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
             System.out.println();
        }
        System.out.println(" Total Subarrays = "+ts);
    }
    public static void main(String[] args) {
        System.out.println("\nSUBARRAYS :\n"); 
        int numbers[] ={2,4,6,8,10};
        printSubarrays(numbers);
    }
}

