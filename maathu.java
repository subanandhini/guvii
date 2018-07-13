import java.util.Scanner;

public class maathu {
public static void main(String[] args) {

Scanner sb=new Scanner(System.in);
	String a=sb.next();
	String aa="";
	String s[]=a.split("");
	for(int i=1;i<s.length;i+=2){
	aa+=a.charAt(i);
	aa+=a.charAt(i-1);
	}
	System.out.println(aa);
	}
		}

