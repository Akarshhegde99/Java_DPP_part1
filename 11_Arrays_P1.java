//1]

import java.util.*;
public class july12 {
    public static void main(String[] args) {
        int marks[]= new int[100];

        Scanner sc =new Scanner(System.in);
        System.out.println("Length of array : "+ marks.length);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Physics : "+ marks[0]);
        System.out.println("Chemistry : "+ marks[1]);
        System.out.println("Maths : "+ marks[2]);

        marks[1]=marks[1]+1;
        System.out.println("Chemistry (New marks) : "+ marks[1]);
    }
}

//2]
import java.util.*;
public class july12{
    public static int linearSearch(int numbers[], int key) {
        
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] ={2,4,6,8,10,12,14,16};
        int key =18;

        //H.W  String menu[] ={"dosa","Chole bature", "Samosa"}
        int index=linearSearch(numbers, key);
        if(index==-1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("Key is at index : "+index);
        }
    }

//3]

import java.util.*;

public class july11{
    public static int getLargest(int numbers[]) {
        int largest =Integer.MIN_VALUE;  //-Infinity
        int smallest =Integer.MAX_VALUE; 

        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is : "+ smallest);

        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};
        System.out.println("Largest value :"+getLargest(numbers));
    }
}

