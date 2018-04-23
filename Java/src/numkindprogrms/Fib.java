package numkindprogrms;

public class Fib {
public static void main(String[] args) {
	int fib1=0;
	int fib2=1;
	int fib3=fib1+fib2;
	System.out.println(fib1+"\n"+fib2+"\n"+fib3);
	
	for(int i=2;i<=10;i++)
	{
		fib1=fib2;
		fib2=fib3;
		fib3=fib1+fib2;
		System.out.println(fib3);
	}
}
}
