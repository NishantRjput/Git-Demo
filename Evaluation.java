import pack.Power;
import java.util.*;
import java.lang.*;
import java.io.*;
class Evaluation
{
 public static void main(String args[])
 {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the no. of which you want to obtain the square");
     int n=sc.nextInt();
  Power p = new Power();
  p.pow(n);
 }
 
}