package advance_java1;

import java.util.*;

public class lab6_2 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();//create the list 

        list.add("Java");// adding to the list
        list.add("Spring");
        list.add("Hibernate");
        list.add("JDBC");

        System.out.println("Original List: " + list);

        Collections.reverse(list);// using the in-build function to reverse list

        System.out.println("Reversed List: " + list);
	}

}
