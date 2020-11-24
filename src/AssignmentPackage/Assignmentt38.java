package AssignmentPackage;

public class Assignmentt38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignmentt38.isPalindrome("liril");
		
		Assignmentt38.isPalindrome("shreya");
	}
	
	public static String reverse(String input) 
	{
		int length = input.length() - 1;
		String reverseString = "";
		
		for(int i=length; i >= 0;i--) 
		{
			reverseString = reverseString + input.charAt(i);
		}
	
		return reverseString;
	}
	
	public static void isPalindrome(String input) 
	{
		String reverse = Assignmentt38.reverse(input);
		if(input.equals(reverse)) 
		{
			System.out.println(input + " This is palindrome");
		}
		else 
		{
			System.out.println(input + " This is not palindrome");
		}
		
	}

}
