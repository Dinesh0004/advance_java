package advance_java;

import java.util.Scanner;

public class scannser_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number A:");
		int a=sc.nextInt();
		System.out.print("enter the number B:");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("sum of the number:"+sum);
		
		
		
		System.out.println("1D array");
		int arr[]=new int[5];
		for (int i=0;i<arr.length;i++) {
			System.out.print("enter age for the roll no "+i+":");
			arr[i]=sc.nextInt();
		}
		for (int i=0;i<arr.length;i++) {
			System.out.println("age for the roll no "+i+":"+arr[i]);
			
		}
		
		System.out.println("2D array");
		int arr2[][]=new int[2][5];
		for (int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print("enter the roll no for calss "+i+" and student "+j+":");
				arr2[i][j]=sc.nextInt();
			}
			System.out.println(" ");
		}
		for (int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.println("the roll no for calss "+i+" and student "+j +" is:"+arr2[i][j]);
				
			}
			System.out.println(" ");
		}
		System.out.println("3D array");
		int arr3[][][]=new int[2][3][5];
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				for(int k=0;k<arr3[i][j].length;k++) {
					System.out.print("enter the age for collage "+i+" in classroom "+j+" for student "+ k+":");
					arr3[i][j][k]=sc.nextInt();				}
				System.out.println(" ");
			}
			System.out.println(" ");
		}
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				for(int k=0;k<arr3[i][j].length;k++) {
					System.out.println("the age for collage "+i+" in classroom "+j+" for student "+ k+":"+arr3[i][j][k]);
								}
				System.out.println(" ");
			}
			System.out.println(" ");
		}
	}
	
	

}
