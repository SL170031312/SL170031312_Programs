package arrays;

public class P3_14 {
public static void main(String[] args) {
	int i=0,j=0,m=0;
	for(i=0;i<2;i++) {
		for(j=0;j<2;j++) {
			System.out.print(args[m]+" ");
			m++;
		}
		System.out.println();
	}
	m=3;
	for(i=0;i<2;i++) {
		for(j=0;j<2;j++) {
			System.out.print(args[m]+" ");
			m--;
		}
		System.out.println();
	}
}
}
