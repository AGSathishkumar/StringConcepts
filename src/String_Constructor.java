import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class String_Constructor {

	public static void main(String args[]) throws UnsupportedEncodingException

	{
		// ******************** Creating a String ********************
		System.out.println("******************** Creating a String *********************\n ");

		// 1. Literal

		String literal = "Welcome";

		System.out.println("Literal --> " + literal);

		// 2.New

		String var = new String("Welcome");

		System.out.println("New	--> " + var + "\n");
		// ******************** String Constructor ********************

		System.out.println("******************** String Constructor ********************\n");

		// 1.String (byte[] arr)

		byte[] b_arr = { 71, 101, 101, 107, 115 };

		String output = new String(b_arr);

		System.out.println("1.) String (byte[] arr) --> " + output);

		// 2.String (byte[] arr,Charset char_set)

		byte[] b_ar = { 71, 101, 101, 107, 115 };

		Charset cs = Charset.defaultCharset();

		System.out.println("Charset --> " + cs);

		String s_byte_char = new String(b_arr, cs); // Geeks

		System.out.println("2.) String (byte[] arr,Charset char_set) --> " + s_byte_char);

		// 3.String (byte[] b,String charsetName)

		byte[] b = { 71, 101, 101, 107, 115 };

		String op = new String(b, "US-ASCII");

		System.out.println("3.) String (byte[] b,String charsetName) --> " + op);

		// 4.String (byte[] a,int startindex,int length)

		byte[] a = { 71, 101, 101, 107, 115 };

		String output1 = new String(a, 1, 3);

		System.out.println("4.) String (byte[] a,int startindex,int length) -->" + output1);

		// 5.String (byte[] c,int startindex,int length,Charset charset)

		byte[] c = { 71, 101, 101, 107, 115 };

		Charset cs1 = Charset.defaultCharset();

		String output2 = new String(c, 1, 3, cs1);

		System.out.println("5.) String (byte[] c,int startindex,int length,Charset charset) -->" + output2);

		// 6.String (byte[] d,int startindex,int length,String charsetname)

		byte[] d = { 71, 101, 101, 107, 115 };

		String output3 = new String(c, 1, 4, "US-ASCII");

		System.out.println("6.) String (byte[] d,int startindex,int length,String charsetname) -->" + output3);

		// 7.String (char[] char_arr)

		char char_arr[] = { 'G', 'e', 'e', 'k', 's' };

		String output4 = new String(char_arr);

		System.out.println("7.) String (char[] char_arr) -->" + output4);

		// 8.String (char[] e,int start_index,int count)

		char e[] = { 'G', 'e', 'e', 'k', 's' };

		String output5 = new String(e, 1, 3);

		System.out.println("8.) String (char[] e,int start_index,int count) -->" + output5);

		// 9.String(int[] uni_code_points, int offset, int count)

		int[] uni_code = { 71, 101, 101, 107, 115 };

		String output6 = new String(uni_code, 1, 3);

		System.out.println("9.) String(int[] uni_code_points, int offset, int count)  -->" + output6);

		// 10.String (StringBuffer s_buffer)

		StringBuffer s_buffer = new StringBuffer("Geeks");

		String output7 = new String(s_buffer); // Geeks

		System.out.println("10.)String (StringBuffer s_buffer)  -->" + output7);

		// 11.String (StringBuilder sbuilder)

		StringBuilder s_builder = new StringBuilder("Geeks");

		String output8 = new String(s_builder);

		System.out.println("11.)String (StringBuilder  sbuilder)  --->" + output8);

	}
}
