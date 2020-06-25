import java.util.*;
public class P2_5 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
char c1=s.next().charAt(0);
char c2=s.next().charAt(0);
if(c1>c2) {

	System.out.println(c2+","+c1);
}
else if(c2>c1) {
	System.out.println(c1+","+c2);
}



}
}
