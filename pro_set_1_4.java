import java.util.*;

public class pro_set_1_4  {
public static void main(String[] args) {
	//System.out.println("fgfyd");
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter two values");
	    String s=ss.next();
	    String a=ss.next();
	    boolean c;
	   int counter=0;
	    int len=s.length();
	    		if(s.length()<a.length())
	    			{
	    			len=a.length()-s.length();
	    			c=true;}
	    		else {
	    			len=s.length()-a.length();
	    			c=false;
	    			}
	   if(c==true) {
	    for(int i=0;i<s.length();i++) {
	    	if(a.charAt(i)==s.charAt(i))
	    		continue;
	    	else
	    		counter+=Math.abs(a.charAt(i)-s.charAt(i));
	    	
	    }}
	   if(c!=true) {
		    for(int i=0;i<a.length();i++) {
		    	if(a.charAt(i)==s.charAt(i))
		    		continue;
		    	else
		    		counter+=Math.abs(a.charAt(i)-s.charAt(i));
		    	
		    }}
	    
	System.out.println(counter+len);}

}
