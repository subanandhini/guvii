
import java.util.Scanner;

public class hunter_9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	String pm="";int c=0;
	for(int n=n1;n<=n2;n++){     
		int f=0;
		for(int i=n;i>=1;i--){      
		    if(n%i==0){       
		     f=f+1;      
		    }      
	            }
		if(f==2) {
			pm=pm+n+" ";
			c++;
		}
			
}System.out.println(c);
}}
