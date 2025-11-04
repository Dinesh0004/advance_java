package advance_java;
import java.util.*;
public class string_memory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("constant pool");
		String s1="java";
		String s2="java";
		if(s1==s2) {
			System.out.println("the reference are equal");
		}else {
			System.out.println("the reference are not equal");
		}
		System.out.println("Non- constant pool");
		String s3=new String ("java");
		String s4=new String( "java");
		if(s3==s4) {
			System.out.println("the reference are equal");
		}else {
			System.out.println("the reference are not equal");
		}
		System.out.println("String concatenation");
		String s5="java";
		String s6="pythot";
		String s7=s5+s6;
		String s8=s5+s6;
		if(s7==s8) {
			System.out.println("the reference are equal");
		}else {
			System.out.println("the reference are not equal");
		}
		System.out.println("String tokenizer");
		String s9="java php sql python C# git linux";
		StringTokenizer st=new StringTokenizer(s9);
		while(st.hasMoreTokens()==true) {
			System.out.println(st.nextToken());
		}
		
	}

}
