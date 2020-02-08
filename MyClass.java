import java.util.ArrayList;
import java.util.Collections;
public class MyClass { 
  public static void main(String[] args) { 
    ArrayList<Integer> cars = new ArrayList<Integer>();
    cars.add(1);
    cars.add(2);
    cars.add(8);
    cars.add(4);
    Collections.sort(cars);
    System.out.println(cars);
  } 
}