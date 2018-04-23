package arrays;

public class MissingNums {
public static void main(String[] args) {
	int a[]={1,20};
	
	for(int i=1;i<=20;i++)
	{int count=0;
		for(int j=0;j<=a.length-1;j++)
		{
			if(i==a[j])
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println(i);
		}
	}
}
}
