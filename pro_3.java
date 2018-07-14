import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Nonrepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		String str=str1+str2;
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
	System.out.println( alt.size()*2);
	}

}
