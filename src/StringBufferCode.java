import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringBufferCode {

	public static void main(String args[]) {
		
		StringBuffer sf=new StringBuffer("Welcome");
		
		int length = sf.length();
		
		System.out.println("1.) String Buffer Length of the string --> "+length);
		
		int capacity = sf.capacity();
		
		// StringBuffer = It reserves room for 16 characters without reallocation.
		
		System.out.println("2.) String Buffer Length of the string --> "+capacity);
		
		//append --> Passing String

		StringBuffer append = sf.append("1");
		
		System.out.println("3.) String Buffer ~ Append (Passing String) --> "+append);
		
		//append --> Passing int

		StringBuffer append1 = sf.append(6);
	
		System.out.println("4.) String Buffer ~ Append (Passing Int--> "+append1);
		
		//insert 
		
		StringBuffer insert2 = sf.insert(0, "for");
		
		System.out.println("5.) Insert (string)--> "+insert2);
		
		StringBuffer insert = sf.insert(0, 1);
		
		System.out.println("6.) Insert (int)--> "+insert);
		
		StringBuffer insert3 = sf.insert(0, true);
		
		System.out.println("7.) Insert (true)--> "+insert3);
		
		StringBuffer insert4 = sf.insert(0, 42.35d);
		
		System.out.println("8.) Insert (double)--> "+insert4);
		
		StringBuffer insert5 = sf.insert(0, 42.3f);
		
		System.out.println("9.) Insert (float)--> "+insert5);
		
		char[]  insertchar= {'N','E','W'};
		
		StringBuffer insert6 = sf.insert(1, insertchar);
		
		System.out.println("10.) Insert (Char)--> "+insert6);
	
		// delete 
		
		StringBuffer delete = sf.delete(0, 2);
		
		System.out.println("11.) Delete --> "+delete);
		
		// deleteCharAt
		
		StringBuffer delete1 = sf.deleteCharAt(1);

		System.out.println("12.) DeleteCharAt --> "+delete1);

		//Replace 
		
		StringBuffer replace = sf.replace(0,1, "str");

		System.out.println("13.) replace --> "+replace);

		// Ensure Capacity (Entering size should greater than 16 )
		 
		StringBuffer sf2 = new StringBuffer();
		
		System.out.println("14.) Before - ensureCapacity--> "+sf2.capacity());
	
		sf2.ensureCapacity(17);
		
		System.out.println("15.) After -  ensureCapacity --> "+sf2.capacity());


        // create a StringBuffer object 
        // with a String pass as parameter 
        StringBuffer 
            str 
            = new StringBuffer("Geeks For Geeks"); 
  
        // print string 
        System.out.println("String = "
                           + str.toString()); 
  
        // create a char Array 
        char[] array = new char[15]; 
  
        // initialize all character to .(dot). 
        Arrays.fill(array, '.'); 
  
        // get char from index 0 to 9 
        // and store in array start index 3 
        str.getChars(0, 9, array, 1); 
  
        // print char array after operation 
        System.out.print("char array contains : "); 
  
        for (int i = 0; i < array.length; i++) { 
            System.out.print(array[i] + " "); 
        }

	
		
	}

}
