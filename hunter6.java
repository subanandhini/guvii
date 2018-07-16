import java.util.Scanner;
public class hunter6 {
public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
     int a=s.nextInt();
	int aa[]=new int[a];
	int co=1;
	for(int i=0;i<a;i++) {
		aa[i]=s.nextInt();
	}
	in:for(int i=0;i<a-1;i++) {
		if(aa[i]==aa[i+1]) {
			System.out.println(aa[i]);
			co++;
			break in;
		}}
	if(co==1)
			System.out.println("Unique");
	
	
	s.close();
}
}
