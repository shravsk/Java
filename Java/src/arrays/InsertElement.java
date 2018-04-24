package arrays;

import java.util.Scanner;

public class InsertElement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("entr the size of the array ");
	int size=sc.nextInt();
	int a[]=new int[size];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Displaying elements...");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
}
}
