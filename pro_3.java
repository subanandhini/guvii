import java.util.ArrayList;
import java.util.Arrays;

public class pro_3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="JOKERJOKER";
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
