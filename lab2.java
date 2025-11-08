package advance_java1;
import java.util.Scanner;
class strongnum{//class defined
	public void strong(int num) {
		int temp=num,sum=0;//declaration of the variable
				while(num>0) {
			int dig=num%10;//to get the each digit in the sequence of the number
			int fact=1;
			for (int i=1;i<=dig;i++)// it is used to find the factorial for each number 
			{
				fact *=i;
			}
			sum+=fact;//adding values of the factorial in the one variable 
			num=num/10;
		}
		// using the the ternary operator check the conduction 
		System.out.println((sum==temp) ? "is a strong number":"is not a strong number");
			} }
class leap{// class defined
	public void leap(int y) {
		//using the ternary operator to print the string by check the condition
		System.out.println((y%4==0 && y%100!=0 || y%400==0)?  y+" is a leap year":y+" is not leap year");
			} }
public class lab2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);// the object created for the scanner class
		strongnum str=new strongnum();// the object created  for class strongnumber class
		leap leap=new leap();// the object created  for class leap class
		System.out.print("enter the number to check strong number or not: ");
		int strong=sc.nextInt();// get the input number  from the user
		str.strong(strong);// call the object and the function
		System.out.print("enter the number to check leap year or not: ");
		int year=sc.nextInt();//get the input from the user
		leap.leap(year);//call the object and the function
	} }
