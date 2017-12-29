package interviewQuestions;


public class SumOfNumbersInString {

	public static void main(String[] args) {

		String s = "Manohar 12 Patidar 14 Symphony 20";
		char ch[] = new char[100];
		ch = s.toCharArray();
		int sum = 0, number;
		System.out.println(ch.length);
		int p;
		for (int i = 0; i < ch.length; i++) {
			int k = i;
			if ((i < ch.length)) {

				try {
					while (ch[i] != ' ') {
						i++;
						if ((ch[i] == '\0')) {
							break;
						}
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("exception  :" + e);
				}

			}

			String str1 = s.substring(k, i);
			/*if (StringUtils.isNumeric(str1)) {
				number = Integer.parseInt(str1);
				sum = sum + number;
			}*/
		}
		System.out.println(sum);
		
		String s1 = "manohar";  
		String s2=s1.intern();  
		System.out.println(s2);
	}

}
