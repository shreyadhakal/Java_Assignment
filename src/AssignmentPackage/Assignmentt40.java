package AssignmentPackage;

public class Assignmentt40 {

	public static void main(String[] args) {
		String a = "Shreya";
		int length = a.length() - 1;
		String b = "";
		
		for(int i=length; i >= 0;i--) 
		{
			b = b + a.charAt(i);
		}
	
		System.out.println("Reverse is :" + b);
	}

}
