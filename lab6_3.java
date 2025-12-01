package advance_java1;

import java.util.ArrayList;

public class lab6_3 {

	public static void main(String[] args) {
		 ArrayList<Integer> nums = new ArrayList<>();//create the list 

	        nums.add(2);//adding the element to the list
	        nums.add(5);
	        nums.add(8);
	        nums.add(10);
	        nums.add(13);
	       
	        int sum = 0;//to calculate the value 

	        for (int n : nums) {//it run un-till list size
	            if (n % 2 == 0) {//check the condition and add the even number...
	                sum += n;
	            }
	        }

	        System.out.println("Sum of even numbers: " + sum);

	}

}
