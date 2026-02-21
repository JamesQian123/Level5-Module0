package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((String s) -> {
			StringBuilder sb = new StringBuilder(s);
			String reversed = sb.reverse().toString();
			System.out.println(reversed);
		}, "reverse");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((String s) -> {
			StringBuilder sb = new StringBuilder(s);
			
			int rand = (int) Math.random()*1;
			for(int i = 0; i < sb.length(); i++) {
				if(rand == 0) {
					s.substring(i, i+1).toUpperCase();
				}
				else {
					s.substring(i,i+1).toLowerCase();
				}
			}
			System.out.println(s);
		}, "upperandLowercase");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s) -> {
			String newString = "";
			for(int i = 0; i < s.length();i++) {
				newString += s.substring(i,i+1) + ".";
			}
			System.out.println(newString);
		}, "period");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		
		printCustomMessage((s) ->{
			String newString = "";
			for(int i = 0; i < s.length(); i++) {
				if(s.substring(i,i+1).equalsIgnoreCase("A") || s.substring(i,i+1).equalsIgnoreCase("E") ||s.substring(i,i+1).equalsIgnoreCase("O") ||s.substring(i,i+1).equalsIgnoreCase("I") ||s.substring(i,i+1).equalsIgnoreCase("U")) {
					
				}
				else {
					newString += s.substring(i,i+1);
				}
			}
			System.out.print(newString);
		}, "vowels");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
