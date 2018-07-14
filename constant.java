import java.util.*
class constant{
public static void main(String [] agrs){
Scanner s=new Scanner(System.in);
char a=s.next().charAt(0);
if((a>=65&&a<=90&&a!='A'&&a!='e'&&a!='i'&&a!='o'&&a!='u')||(a>=97&&a<=122&&a!='A'&&a!='E'&&a!='I'&&a!='O'&&a!='U'))
		System.out.println("consonant");
	else if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
		System.out.println("Vowel");
	else
		System.out.println("InValid");


}}
