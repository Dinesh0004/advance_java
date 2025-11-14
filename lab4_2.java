package advance_java1;
import java.util.*;

class CountrynotvalidException extends Exception{//Creating the own custom exception 
	public CountrynotvalidException(String message) {
		super(message);
	}
	
}
class EmployeeNameinvalidException extends Exception{//Creating the own custom exception
	public EmployeeNameinvalidException(String m) {
		super(m);
	}
}
class taxnoteligibleException extends Exception{//Creating the own custom exception
	public taxnoteligibleException(String m) {
		super(m);
	}
}
class taxcalculator {
	//using the keyword throws including the exception for this function
	double tax(String empname,boolean isindian,double empsal) throws CountrynotvalidException,EmployeeNameinvalidException,taxnoteligibleException {
		double taxamt=0;
		if (!isindian) {
			throw new CountrynotvalidException("invalid country");// using the throw invoke exception
		}
		if(empname==null||empname.trim().isEmpty()) {
			throw new EmployeeNameinvalidException("invalid name");// using the throw invoke exception
					}
		if (empsal>100000&&isindian) {
			taxamt=empsal*8/100;
		}else if(empsal>50000&&empsal<=100000&&isindian) {
			taxamt=empsal*6/100;
		}else if(empsal>30000&&empsal<=50000&&isindian) {
			taxamt=empsal*5/100;
		}else if(empsal>10000&&empsal<=30000&&isindian) {
			taxamt=empsal*4/100;
		}else {
			throw new taxnoteligibleException("tax not eligible");// using the throw invoke exception
		}
		return taxamt;
		}
}


public class lab4_2 {
	public static void main(String[] args)  {
		String empname;
		boolean isindian;
		double empsal,tax;
		Scanner sc=new Scanner(System.in);
		taxcalculator cal=new taxcalculator();//creating the object for the taxcalculator 
		System.out.print("Enter the emp name: ");
		empname=sc.nextLine();
		System.out.print("is he/she are an indian(true/false): ");
		isindian=sc.nextBoolean();
		System.out.print("enter the salary: ");
		empsal=sc.nextDouble();
		try {//using the try block we can monitor the exception 
		tax = cal.tax(empname, isindian, empsal);
		System.out.print("the tax is : "+tax);
		}
		catch(CountrynotvalidException e) {//when the exception throw it will execute
			System.out.println(e.getMessage());
		}
		catch(EmployeeNameinvalidException e) {//when the exception throw it will execute
			System.out.println(e.getMessage());
		}
		catch(taxnoteligibleException e) {//when the exception throw it will execute
			System.out.println(e.getMessage());
		}
		catch(Exception e) {//when the exception throw it will execute
			System.out.println(e.getMessage());
		}
	}
}
