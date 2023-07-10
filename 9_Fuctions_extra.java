//1]

import java.util.*;
public class july09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first no. : ");
        double x = sc.nextDouble();
        System.out.print("Input second no. : ");
        double y = sc.nextDouble();
        System.out.print("Input third no. : ");
        double z =sc.nextDouble();
        System.out.print("The avg value is "+ average(x,y,z)+"\n");
    }

public static double average(double x,double y,double z) {
    return(x+y+z)/3;
  }
}
