package com.sirius.javatraining;

import java.util.Scanner;

public class ExerciseOne implements Area {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter number of times user need to enter values");
		int iteration = in.nextInt();

		ExerciseOne eo = new ExerciseOne();

		for (int i = 1; i <= iteration; i++) {

			System.out.println("---Menu---\n1. Circle\n2. Rectangle\n3.Square");
			System.out.println("Please enter your choice:");
			int choice = in.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Calculating the area of Circle");
				System.out.println("Enter Radius");
				int r = in.nextInt();
				eo.circle(r);
				break;
			case 2:
				System.out.println("Calculating the area of Rectangle");
				System.out.println("Enter Length");
				int l = in.nextInt();
				System.out.println("Enter Breadth");
				int b = in.nextInt();
				eo.rectangle(l,b);
				break;
			case 3:
				System.out.println("Calculating the area of Square");
				System.out.println("Enter Length");
				int l1 = in.nextInt();
				eo.square(l1);
				break;

			default:
				System.out.println("Invalid choice");
			}
		}

	}

	@Override
	public void circle(double x) {
		double z = 3.14 * x * x;
		System.out.println("the area of the circle is " + z + " sq units");

	}

	@Override
	public void rectangle(double x, double y) {
		System.out.println("the area of the rectangle is " + x * y
				+ " sq units");

	}

	@Override
	public void square(double x) {
		System.out.println("the area of the square is " + Math.pow(x, 2)
				+ " sq units");
	}
}
