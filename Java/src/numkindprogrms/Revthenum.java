package numkindprogrms;

public class Revthenum {
public static void main(String[] args) {
	int num=123;
	int rev=0;
	
	while(num!=0)
	{
		int rem=num%10;
		num=num/10;
		rev=(rev*10)+rem;
	}
	System.out.println("After reversing the num is "+ rev);
}
}
