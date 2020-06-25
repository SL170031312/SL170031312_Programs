import java.util.*;
import java.io.*;
public class P2_1{
public static void main(String[] args){
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
if(n>0){
System.out.println(+n+" is pos");
}
else if(n<0){
System.out.println(+n+" is neg");
}
else {
System.out.println(+n+" is neither pos nor neg");
}
}
}