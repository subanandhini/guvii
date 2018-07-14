import java.util.*;
public class hunter_1 {

	public static void main(String[] args) {
	Scanner s= new Scanner (System.in);
	int st=s.nextInt();
	int nw[]=new int[st];
	 String str="";
	for(int i=0;i<st;i++) {
		 nw[i]=s.nextInt();
		 str+=nw[i];
	}
	int n=str.length();	
ArrayList<Character> alt = new ArrayList<Character>();
	for (int i = 0; i < n; i++) {
        int j;
        for (j = 0; j < n; j++)
            if (i!=j&&str.charAt(i)==(str.charAt(j)))
                break;
        if (j == n)
           alt.add(str.charAt(i)); 
	}
	System.out.println(alt);
}}
