import java.util.Scanner;
public class hunter6 {
public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
     int a=s.nextInt();
	int aa[]=new int[a];
	for(int i=0;i<a;i++) {
		aa[i]=s.nextInt();
	}
	in:for(int i=0;i<a;i++) {
		if(aa[i]==aa[i+1]) {
			System.out.println(aa[i]);
			break in;
		}
		
	}
	
	s.close();
}
}
