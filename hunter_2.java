import java.util.Scanner;

public class hunter_2 {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     String a=s.nextLine();
     StringBuilder sb=new StringBuilder();
    String ss[]= a.split(" ");
    
    for (int i = ss.length-1;i>=0; i--) {
    	 sb.append(ss[i]+" ");
	}
     sb.reverse();
     System.out.println(sb.toString());
     
    }

}
