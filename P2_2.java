import java.util.Scanner;

public class P2_2 {
public static void main(String[] args) {
	int n;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	if(n%2==0) {
		System.out.println(+n+" is even");
	}
	else {
		System.out.println(+n+" is odd");
	}
}
}
