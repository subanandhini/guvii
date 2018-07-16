import java.util.Scanner;

public class pro_10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Two String :");
String a=s.next();
String b=s.next();
System.out.println(a.substring(0, a.length()-1).equals(b.substring(0, b.length()-1))?"YES":"No");

s.close();
	}

}
