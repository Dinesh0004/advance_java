package advance_java1;

public class lab_4 {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};// array create with total size 5

        try {// to check the exception by this code
            for (int i = 0; i <= arr.length; i++) {   // loop for access the array by the index number
                System.out.println("Element at index " + i + ": " + arr[i]);// print the value
            }
        } catch (ArrayIndexOutOfBoundsException e) 
        //the ArrayIndexOutOfBoundsException is used to check array and throw the error 
        {
            System.out.println("Error: Array index out of bounds....");
        }
	}
}
