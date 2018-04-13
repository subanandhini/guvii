import java.util.*;

public class Duplicate {
	public static void main(String[] args) {
		int n=0;
	System.out.println("enter total number ");
	
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
System.out.println("enter number");
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
					if((a[i]==a[j]) &&(i!=j))
						{
						System.out.println(a[j]);
				}
			}
		}
	}
}
