package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfStrings {

	public static void main(String[] args) {
		String[] array = {"Prem","Mahi","Sri","Lali"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Please ente string :: ");
		String input = sc.next();
		if(Arrays.asList(array).contains(input)) {
			
			System.out.println("true");
			
		}
		else {
			System.out.println("false");
		}
	}
}