import java.util.Scanner;

public class Fibonacci {

	public static int fib(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
	public static void print(int n) {
		if(n==0) {
			return;
		}
		print(n-1);
		System.out.println(fib(n-1));
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the nth no: ");
		int n=sc.nextInt();
//		for(int i=0;i<n;i++) {
//			System.out.print(fib(i)+" ");
//		}
//		
		print(n);
		sc.close();
	}

}
