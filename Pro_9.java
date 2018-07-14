import java.util.*;
public class Pro_9 {

	public static void main(String[] args) {
    Scanner s=new Scanner (System.in);
    int set=s.nextInt();
    int arr[]=new int[set];
    for(int i=0;i<set;i++)
    	arr[i]=s.nextInt();
   
    for(int i=0;i<set;i++)
    if(arr[i]==i)
    	System.out.print(arr[i]+" ");
    
	}

}
