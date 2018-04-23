package numkindprogrms;

public class PatternProgram {
public static void main(String[] args) {
	int line=4;
	int space=line-1;
	for(int i=1;i<=line;i++)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=i;k>=1;k--)
		{
			System.out.print(k);	
		}
		System.out.println();
		space--;
	}
  }
}
