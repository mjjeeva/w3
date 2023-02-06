package w3school;

import java.util.Scanner;

public class w3example {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a,n=0,t=0;
	double avg;
	
	System.out.println("enter ther numbers");
	int x = s.nextInt();
	
		for (int i = 0; i <x; i++) {
			System.out.println("enter the number");
			int j = s.nextInt();
			t=t+j;
			
		}
		avg = t/x;
		System.out.println(avg);
		 
	}

}
