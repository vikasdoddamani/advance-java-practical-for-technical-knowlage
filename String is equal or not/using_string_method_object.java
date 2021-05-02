 // (co-of https://github.com/vikasdoddamani)
// Java program to check what ever is equal or not.

class using_string_method_object
{

	public static void main(String[] args) 
	{
		StringBuilder a= new StringBuilder("HELLO JAVA");
StringBuilder b= new StringBuilder("HELLO JAVA");
if (a.toString().equals(b.toString()))
{
System.out.println("Objects are equal");

	}
	else
	{
System.out.println("Objects are NOT equal");
	}
}

}