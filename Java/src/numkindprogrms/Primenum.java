package numkindprogrms;

public class Primenum {
public static void main(String[] args) {
	
	for(int i=2;i<=10;i++)
	{
		int num=i;
		int count=0;
		
		for(int j=1;j<=num;j++)
		{
			if(num%j==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime num "+num);
		}
		else
		{
			System.out.println("its not a prime num "+num);
		}
	}
	}
}

