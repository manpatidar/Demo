package String_;

public class StringTest {

	public static void main(String[] args) {

		String str = " Manohar?     Patidar.Ratlam";
		str = str.trim();
		if(str.contains("  "))
		{
			//str.replace("  ", " ");
			str.replaceAll("( )+", " ");
		}
		int l = str.length();
		char[] ch = new char[100];
		char[] a = new char[100];
		ch = str.toCharArray();
		for (int i = 0; i < l; i++) {
			System.out.print(ch[i]);
		}
		System.out.println("\n");
		int i =0,j=0,len=l;
		while(len>0)
		{
			try{
				if(ch[i]=='.' || ch[i]=='?')
				{
					a[j++]=ch[i++];
					if(ch[i]!=' ')
					{
						a[j++]=' ';
						a[j]=ch[i];
						i++;j++;
					}
				}
				a[j]=ch[i];
				i++;j++;
				len--;
			}catch(Exception e){
				break;
			}
			
		}
		a.toString();
			System.out.println(a);
	}

}
