package advance_java;
import java.util.Scanner;

public class login_validation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String userid="dinesh";
		int passwd=1234;
		System.out.println("enter the user name");
		String temp_userid=sc.nextLine();
		if(userid.equals(temp_userid)) {
			System.out.println("enter the passwd:");
			int temp_passwd=sc.nextInt();
			if(passwd==temp_passwd) {
				System.out.println("loging is succesful");
			}else {
				System.out.println("invalid passwd");
			}
		}else {
			System.out.println("invalide userid");
		}
		
	}
	}
