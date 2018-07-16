import java.util.*;
public class begg5 {

	public static void main(String[] args) {
    Scanner s=new Scanner (System.in);
     int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
   a=  Math.min(a, b);
  int min=Math.min(a, c);
  System.out.println(min);
	}

}
