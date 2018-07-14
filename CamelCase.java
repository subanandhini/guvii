import java.util.Arrays;
import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	     String a=s.nextLine();
	     String str="";
		String ss[]=a.split(" ");
		for(int i=0;i<ss.length;i++) {
			str+=ss[i].toUpperCase().charAt(0)+ss[i].substring(1)+" ";
		}
		System.out.println(str);
	}

}
