package advance_java1;


class avg extends Thread{//the thread class is created

	 public void run() {//overridden 
	        int sum = 0;
	        for (int i = 1; i <= 10; i++)
	            sum += i;

	        double avg = sum / 10.0;
	        System.out.println("\nThe average of the first 10 numbers is: " + avg);
	    }
}
class square extends Thread {// the thread class is created.
    int[] arr = {1, 20, 50, 15, 30};

    public void run() {//overridden 
        System.out.println("Squares of numbers in the array:");
        for (int n : arr) {
            System.out.println("Square of " + n + ": " + (n * n));
            try { Thread.sleep(300); } catch (Exception e) {}
        }
    }
}
public class lab5a {

	public static void main(String[] args) {
		square s=new square();
		avg a=new avg();
		s.start();
		a.start();
	}

}
