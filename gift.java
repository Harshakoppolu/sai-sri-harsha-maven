import java.util.*;

interface Sweets{
    int weight=2;
    public int Weight_meth();
}
class Cho implements Sweets{
    int c,w;
    public Cho(int n){
        c=n;
    }
    public int Weight_meth(){
       w=weight*c; 
       return w;
    }
}
class Candy implements Sweets{
    int c,w;
    public Candy(int n){
        c=n;
    }
    public int Weight_meth(){
       w=weight*c;
       return w;
    }
}
class gift{
    int choc,cha,t;
    gift(int ch,int ca){
        cha=ca;
        choc=ch;
    }
    int totalWeight(){
        Cho ch1=new Cho(choc);
        Candy c=new Candy(cha);
        t=ch1.Weight_meth()+c.Weight_meth();
        
        return t;
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		gift g=new gift(3,4);
		gift g1=new gift(3,5);
		gift g2=new gift(3,2);
		int x[]=new int[3];
		x[0]=g.totalWeight();
		x[1]=g1.totalWeight();
		x[2]=g2.totalWeight();
		Arrays.sort(x);
		for(int i=0;i<3;i++){
		    System.out.println(x[i]);
		}
	}
}