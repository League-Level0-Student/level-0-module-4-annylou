package _03_char._2_string_methods;


public class StringMethods {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to contain a minimum of 3 characters
String character = "one";

		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
char three = character.charAt(2);
	System.out.println(three);
	
		// 3. Print the length of your String to the console.
		//    HINT: .length()
int length = character.length();
		System.out.println(length);
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
		
	int letter = 0;
for(length=0; length<=2; length+=1) {
three = character.charAt(0 + letter);
System.out.println(three);
letter++;
	}
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"

	System.out.println(" " +three);
	if(three>=2) {
		System.out.println(" e is at index 2");
	}
	else if(three>=1) {
		System.out.println(" n is at index 1");
	}
	else if(three>=0) {
		System.out.println(" o is at index 0");
	}
	
}
}
	



