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
	for(int i=0;i<a;i++) {
		if(aa[i]%2==0&&i%2!=0)
			System.out.print(aa[i]+" ");
		else if(aa[i]%2!=0&&i%2==0)
			System.out.print(aa[i]+" ");
	}
	
	s.close();
}
}
