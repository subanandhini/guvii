import java.util.*;
public class begg09 {

	public static void main(String[] args) {
    Scanner s=new Scanner (System.in);
    int n=s.nextInt();
    int an=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++) {
    	a[i]=s.nextInt();
    }
    int sum=0;
   for(int i=0;i<an;i++) 
	   sum+=a[i];
   
	System.out.println(sum);}
}
