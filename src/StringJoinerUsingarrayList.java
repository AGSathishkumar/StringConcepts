import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerUsingarrayList {

	public static void main(String[] args) {
		
		StringJoiner sj = new StringJoiner(",");
		
		ArrayList<String> al =new ArrayList<String>();
		
		al.add("A");
		
		al.add("B");
		
		al.add("C");
		
		// add
		
		sj.add(al.get(0)).add(al.get(1));
		
		StringJoiner sj1=new StringJoiner("*","{","}");
		
		sj1.add("AA");
		
		sj1.add("BB");
		
		//merge
		
		StringJoiner merge = sj.merge(sj1);
		
		System.out.println(sj1);
		
		System.out.println("Merge --> "+merge);
	
	}

}
