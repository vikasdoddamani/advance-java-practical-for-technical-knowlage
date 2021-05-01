 // (co-of https://github.com/vikasdoddamani)
// for more information read ReverseString txt file
// Java program to ReverseString using ByteArray.

class ReverseString {
	public static void main(String[] args)
	{
		String input = "VIkas Doddamani";
		byte[] strAsByteArray = input.getBytes();

		byte[] result = new byte[strAsByteArray.length];

		for (int i = 0; i < strAsByteArray.length; i++)
			result[i] = strAsByteArray[strAsByteArray.length - i - 1];

		System.out.println(new String(result));
	}
}
