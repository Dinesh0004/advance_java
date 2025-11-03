package advance_java;

public class pattern_print {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<=5;i++) {
			for(int j=5;j>=0;j--){
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		System.out.println("pattern2");
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		System.out.println("pattern3");
		for(int i=0;i<=5;i++) {
			for(int k=5;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		System.out.println("pattern4");
		for(int i=0;i<=6;i++) {
			for(int k=5;k>=i;k--) {
				if(i>1) {
					break;
				}
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				if(i<2) {
									
				System.out.print("* ");
				}
				if(i==3) {
					System.out.print("  * * * * *");
					break;
				}
				if (i>2) {
					System.out.print("    * * *");
					break;
				}
				
							}
			if(i==2) {
				continue;
			}
			System.out.println(" ");
		}
		System.out.println("pattern5");
		for(int i=0;i<=5;i++) {
			for(int k=5;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i-1;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		for(int i=0;i<=5;i++) {
			for(int k=0;k<=i-1;k++) {
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		System.out.println("Pattern A:");
        int n = 7; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j == 0 || j == n - 1) && i != 0 ||
                    (i == 0 && j > 0 && j < n - 1) ||
                    i == n / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

       
        System.out.println("Pattern B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 ||(j == n - 1 && i != 0 && i != n / 2 && i != n - 1) ||
                    (i == 0 || i == n / 2 || i == n - 1) && j < n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
	}
	
}
