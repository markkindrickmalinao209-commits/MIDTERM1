package Kindrick;

public class StringMethodsExample {
	public static void main(String[] args) {
		String text = " Hello World! ";
		
		//Length
		int length = text.length();
		
		//Upper and lower case
		String upper = text.toUpperCase();
		String lower = text.toLowerCase();
		
		//Strip whitespace
		String stripped = text.strip();
		
		//Find and replace
		int index = text.indexOf("0World");
		String replaced = text.replace("world", "java");
		
		//Split and join
		String[] splitText = text.split("");
		String joined = String.join("-", splitText);
		
		//Output result
		System.out.println("Length: " + length);
		System.out.println("Upper: " + upper);
		System.out.println("Lower: " + lower);
		System.out.println("Stripped: " + stripped+ "");
		System.out.println("Index of 'world': " + index);
		System.out.println("Replaced: " + replaced);
		System.out.println("Joined: " + joined);
		
	}

}
