package w3school;

import java.util.Scanner;

public class oddchartofstring {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		   int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
		   if (arr[0]==3||arr[9]==3) {
			   System.out.println("its correct");
			
		}else {
			System.out.println("not ok");
		}

	}
}
