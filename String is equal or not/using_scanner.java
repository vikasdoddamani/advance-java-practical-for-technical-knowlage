 // (co-of https://github.com/vikasdoddamani)
// Java program to check what ever is equal or not.

import java.util.Scanner;

public class  using_scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String:");
		String str1 = sc.nextLine();
		System.out.println("Enter Second String:");
		String str2 = sc.nextLine();
		sc.close();

		System.out.println("Both Strings are Equal? = " + str1.equals(str2));
		System.out.println("Both Strings are Case Insensitive Equal? = " + str1.equalsIgnoreCase(str2));

	}

}