import java.util.*;

public class P2_8 {
public static void main(String args[]) {
	
/*
	 StringBuffer str = new StringBuffer();
	int ln = str.length(); 
    
   
    for (int i=0; i<ln; i++) 
    { 
        Character c = str.charAt(i); 
        if (Character.isLowerCase(c)) { 
            str.replace(i, i+1, Character.toUpperCase(c)+""); 
        System.out.println(str);
        }
        else {
            str.replace(i, i+1, Character.toLowerCase(c)+""); 
        System.out.println(str);
    } 
    }
*/
	Scanner s=new Scanner(System.in);
/*	char c1=s.next().charAt(0);
	int k=0;
	if(c1>='a' && c1<='z') {
		k='A'+c1-'a';
		char c2=(char) k;
		System.out.println(c2);
	}
	else if(c1>='A' && c1<='Z') {
		k='a'+c1-'A';
		char c3=(char) k;
		System.out.println(c3);
	}*/
	
	String s1="";
	String s2=s.nextLine();
	/*int k=0;
	for(int i=0;i<s2.length();i++) {
	if(s2.charAt(i)>='a' && s2.charAt(i)<='z') {
		k='A'+s2.charAt(i)-'a';
		s1=s1+ (char)k;
		
	}
	else s1=s1+s2.charAt(i);
}

	System.out.println(s1);
	
	
	
	for(int i=0;i<s2.length();i++) {
		if(s2.charAt(i)>='a' && s2.charAt(i)<='z') {
			s2=s2.toUpperCase();
	
		}
		else s2=s2.toLowerCase();
			
}
	System.out.println(s2);*/
	String s3=s2;
	s1=s1+s3.toUpperCase();
	if(s1.equals(s3))
		System.out.println(s2.toLowerCase());
	else
	System.out.println(s2.toUpperCase());
	
	
}
}
