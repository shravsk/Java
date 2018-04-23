package Strings;

public class Swap {
	public static void main(String[] args) {
		String s="aabbbcd";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a')
			{
				char temp='b';
				ch[i]=temp;
				System.out.print(ch[i]);
			}
			else if(ch[i]=='b')
			{
				char temp='a';
				ch[i]=temp;
				System.out.print(ch[i]);
			}
			else if(ch[i]=='c')
			{
				char temp='d';
				ch[i]=temp;
				System.out.print(ch[i]);
			}
			else if(ch[i]=='d')
			{
				char temp='c';
				ch[i]=temp;
				System.out.print(ch[i]);
			}
		}
	}

}
