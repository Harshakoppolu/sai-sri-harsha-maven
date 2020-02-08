import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
class Candies 
{
 int candy_count,c_weight;
 Candies(int c)
 {
  c_weight=2;
  candy_count=c;
 }
 int Candies_weight()
 {
  return c_weight*candy_count;
 }
}
class Sweets
{
 int sweets_count,s_weight;
 Sweets(int s)
 {
  s_weight=5;
  sweets_count=s;
 }
 int sweets_weight()
 {
  return s_weight*sweets_count;
 }
}
public class Main1
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int repeat=1;
  ArrayList<Integer> weight = new ArrayList<Integer>();
  while(repeat==1)
  {
  int i=1;
  System.out.println("Enter number of candies in the gift");
  int c_g=sc.nextInt();
  System.out.println("Enter number of sweets in the gift");
  int s_g=sc.nextInt();
  Candies c=new Candies(c_g);
  Sweets s=new Sweets(s_g);
  weight.add(c.Candies_weight()+s.sweets_weight());
  System.out.println("Do you want to add more");
  int a=sc.nextInt();
  if(a==1)
  {
   repeat=1;
  }
  else
  {
   repeat=0;
  }
  }
  Collections.sort(weight);
  System.out.println("Weights of the gifts are:");
  for (int i : weight) 
    {
      System.out.println(i);
    }
 }
}

  