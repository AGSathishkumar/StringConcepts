
public class StringMethods {

	public static void main(String args[]) {
		System.out.println("*******************String Methods*******************");

		// 1. int length

		String sampleText = "Welcome to Learn";

		int length = sampleText.length();

		System.out.println("1.) Length --> " + length);

		// 2. Char charAt(int i)

		char charAt = sampleText.charAt(3);

		System.out.println("2.) CharAt --> " + charAt);

		// 3. String substring(int i)

		String substring = sampleText.substring(2);

		System.out.println("3.) substring --> " + substring);

		// 4. String substring(int i,int j)

		String substring1 = sampleText.substring(0, 4);

		System.out.println("4.) substring(int i,intj) --> " + substring1);

		// 5. String concat(String str)

		String concat = sampleText.concat("Learning");

		System.out.println("5.) Concat --> " + concat);

		// 6.indexOf (String s)

		int indexOf = sampleText.indexOf("Learn");

		System.out.println("6.) indexOf --> " + indexOf);

		// 7.indexOf (String s,int i)

		int indexOf_second = sampleText.indexOf('L', 1);

		System.out.println("7.) indexOf (String s,int i) --> " + indexOf_second);

		// 8. lastindexOf(String s)

		int lastIndexOf = sampleText.lastIndexOf('e');

		System.out.println("8.) lastindexOf --> " + lastIndexOf);

		// 9. boolean equals( Object otherObj) (Entire word)

		boolean output = sampleText.equals("Welcome to Learn");

		System.out.println("9.) equals --> " + output);

		// 10. boolean equalsIgnoreCase( Object otherObj) (Entire word)

		boolean output1 = sampleText.equalsIgnoreCase("Welcome to learn");

		System.out.println("10.) equalsIgnoreCase --> " + output1);

//		// 11. int compareTo( String anotherString)
//		
//		int compareTo = sampleText.compareTo("to");
//		
//		System.out.println("11.) compareTo --> "+compareTo);

//		// 12. int compareToIgnoreCase( String anotherString)

		// 13.String toLowerCase

		String lowerCase = sampleText.toLowerCase();

		System.out.println("13.) toLowerCase --> " + lowerCase);

		// 14.String toUpperCase()

		String upperCase = sampleText.toUpperCase();

		System.out.println("14.) toUpperCase --> " + upperCase);

		// 15.String trim

		String sampleText1 = " Text ";

		String trim = sampleText1.trim();

		System.out.println("15.) trim -->" + trim);
		
		// 16. String replace (char oldChar, char newChar) ---> String
		
		String replace = sampleText.replace("We","A");
		
		System.out.println("16.) (char oldChar, char newChar) --> "+replace);
		
		// 16. String replace (char oldChar, char newChar) ---> Character
		
		String replace1 = sampleText.replace('W','A');
		
		System.out.println("17.) (char oldChar, char newChar) --> "+replace1);
		
	}
}
