import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pro_2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter number");
	long num=s.nextLong();
	System.out.println("enter no of digits to be removed");
	byte b=s.nextByte();
	String anum=Long.toString(num);
	int has=0;
	ArrayList<Integer> aa=new ArrayList<Integer>();
	for(int i=0;i<anum.length()-b;i++) {
		has=i;
	    for(int j=0;j<anum.length()-b;j+=b) {
	    	aa.add(Integer.parseInt(anum.substring(has,has+b)));
	    	
	}
	}
Collections.sort(aa);
	System.out.println(aa.get(0));
}
}
