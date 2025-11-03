package advance_java;
import java.util.*;

public class marriage_eligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String gender;
		int age;
		System.out.println("enter the gender:");
		gender=sc.nextLine();
		System.out.println("enter the age:");
		age=sc.nextInt();
		if(gender.equalsIgnoreCase("M") && age>=21 || gender.equalsIgnoreCase("F") && age>=18) {
			System.out.println("eligibil for marriage");
			
		}else {
			System.out.print("not eligibil for marriage");
		}
	}

}
