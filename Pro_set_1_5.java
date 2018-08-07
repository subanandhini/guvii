import java.util.*;
public class Pro_set_1_5 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=s.nextInt();
	System.out.println("Enter to numbers to subdivide");
	int on=s.nextInt();
	int in=s.nextInt();
	int sum=0;
	int z=1;
	while(z<100) {
		sum+=(on+in);
		   if(sum==n/2||sum==n) {
					z=10;
			}
		   else
			   z++;
	}
	System.out.println(z==10?"yes":"No");
}
}

