 // (co-of https://github.com/vikasdoddamani)
// for more information read theory_work txt file
// Java program to check what ever is equal or not.

class isequal
{
	public static void input(String input1, String input2)
	{
			System.out.println("your input-1 is = "+ input1);
		System.out.println("your input-2 is = "+ input2);
		if(input1==input2)
		{
			System.out.println("is equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}

	public static void main(String[] args) {
	
input("vikas","vikas");
System.out.println();
input("vikas","praveen");
System.out.println();
input("praveen","praveen");

	}

}
