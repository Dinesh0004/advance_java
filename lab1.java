package advance_java1;
import java.util.Scanner;
class Max{
	public int Max(int num1,int num2) {
		int max = (num1>num2)? num1:num2;//ternary operator check condition for maximum number
		return max;//return the value
	}
	}
class Bit{
	public int bit(int num,int n)
	{
		int bit=(num >>n)&1;// performing the conduction 
		return bit;//return the value
	}
}
public class lab1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);//creating the object for scanner class
		Max max =new Max();//creating the object for the Max class
		Bit bit=new Bit();//creating the class  for Bit class 
		System.out.print("enter the any two numbers to find the max number :");
		int number1=sc.nextInt();//get input from the user
		int number2=sc.nextInt();//get input from the user
		System.out.println("the max no is:"+max.Max(number1, number2));//call the object max
		System.out.print("enter the  numbers to find the nbit  :");
		int num=sc.nextInt();//get input from the user
		int n=sc.nextInt();//get input from the user
		System.out.println("the bit is:"+bit.bit(num, n));	// call the object bit
		}
}

