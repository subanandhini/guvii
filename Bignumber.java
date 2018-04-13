import java.util.*;

public class Bignumber{
	public static void main(String[] args) {
		int n=0;
	System.out.println("enter total number ");
	
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
System.out.println("enter number");
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();}
	for(int i=0;i<n;i++) {
		int max=0;
		 	if(a[i]>max) 
		 	{
		 		max=a[i];
			}
				System.out.print(max);
			}
	}
	}
