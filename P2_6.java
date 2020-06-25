import java.util.*;
public class P2_6 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	char c1=s.next().charAt(0);
	if((c1>='a' && c1<='z' )|| (c1>='A' && c1<='Z')) {
		System.out.println("Alphabet");
	}
	else if(c1>='0' && c1<='9') {
		System.out.println("Digit");
		
	}
	else {
		System.out.println("Special character");
	}
}
}
