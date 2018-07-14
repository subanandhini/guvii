import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pro_2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter number");
	BigInteger num =s.nextBigInteger();
	System.out.println("enter no of digits to be removed");
	byte b=s.nextByte();
	String anum=""+num;
	int has=0;
	ArrayList<String> aa=new ArrayList<String>();
	if(b!=0)
	for(int i=0;i<anum.length()-b+1;i++) {
		has=i;
	    for(int j=0;j<anum.length()-b;j+=b) {
	    	aa.add(anum.substring(has,has+b));
	    	
	}
	}
	else
		aa.add(anum);
	
Collections.sort(aa);
	System.out.println(aa.get(0));
}
}
