import java.util.StringJoiner; 

public class StringJoiners {

	public static void main(String args[])
	{
	       StringJoiner sj1 = new StringJoiner(",");
	       
	       // setEmptyValue
	       
	       System.out.println(sj1.setEmptyValue("setEmptyValue"));
	       
	       // Add StringJoiner 
	       
	       sj1.add("Test1");
	       
	       sj1.add("test2");
	       
	       // length
	       
	       System.out.println("Length --> "+sj1.length());
	       
	       StringJoiner sj2 = new StringJoiner("*","[","]");
	       
	       sj2.add("Welcome").add("to");
	              
	       sj2.add("Learn");

	       // Merge
	       StringJoiner merge = sj2.merge(sj1);
	       
	       System.out.println("Merge -->"+merge);
	       
	       
	}
}
