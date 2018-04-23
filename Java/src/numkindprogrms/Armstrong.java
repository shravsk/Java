package numkindprogrms;

public class Armstrong {
public static void main(String[] args) {
	int num=153;
	int rem=0;
	int temp=num;
	
	while(num!=0)
	{
		int n=num%10;
		rem=rem+(n*n*n);
		num=num/10;
	}
	
	if(rem==temp)
	{
		System.out.println("Given num is Armstrong.. "+rem);
	}
	else
	{
		System.out.println("Given num is not armstrong.. ");
	}
}
}
