package cis.vmi.edu;

import java.util.Scanner;

/*
 * Author: Joshua Licona
 * Purpose: comupting perimeter of a triangle
 * 
 */
public class trianglePerimeter {

	public static void main(String[]args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Length of first side of triangle: ");
		int side1=scanner.nextInt();
		
		System.out.println("Second side: ");
		int side2=scanner.nextInt();
		
		System.out.println("Third side: ");
		int side3=scanner.nextInt();
		
		if(side1+side2>side3&&side1+side3>side2&&side2+side3>side1) {
			int perimeter=side1+side2+side3;
			
			System.out.println("The perimeter of the triangle is:: "+perimeter);
		}
		else {
			System.out.println("The input is invalid");
		}
		
	}
}
