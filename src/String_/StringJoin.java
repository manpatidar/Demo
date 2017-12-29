package String_;

public class StringJoin {

	public static void main(String[] args) {

		String str = "Manohar Patidar Ratlam";
		System.out.println(str);
		// String joinString1=String.join("-","welcome","to","javatpoint");
		// System.out.println(joinString1);

		String s1 = "javatpoint    is a very good website";
		String replaceString = s1.replace("  ", " ");// replaces all occurrences
														// of 'a' to 'e'
		System.out.println(replaceString);

		String s = "Sachin";
		s.concat(" Tendulkar");// concat() method appends the string at the end
		System.out.println(s);// will print Sachin because strings are immutable
								// objects
		s = s.concat(" Tendulkar");
		System.out.println(s);
		
		String st = "Manohar Patidar Ratlam";
		st = st.concat(" Pune");
		str.concat(" Bangalore");
		System.out.println(str);
		System.out.println(st);
	}

}
