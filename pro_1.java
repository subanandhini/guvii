import java.util.Scanner;

public class LongCommonPrefix {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	int tim=s.nextInt();
	int count=0,has=0;
	String ss[]=new String[tim];
  ss[0]=s.next();
	int len=ss[0].length(),min=9898989;
	for(int i=1;i<tim;i++) {
		ss[i]=s.next();
			min=Math.min(min,ss[i].length());
	}for(int i=0;i<min-1;i++) {
		
	for(int j=0;j<tim-2;j++) {
		if(ss[j].charAt(i)==ss[j+1].charAt(i)) 
		     continue;
		else {
			count=1;break;}		
	       }
	if(count==0) {
		has++;
		System.out.print(ss[0].charAt(i));}
		else 
			break;
	}
	if(has==0)
		System.out.println("No common value");
	}
}
