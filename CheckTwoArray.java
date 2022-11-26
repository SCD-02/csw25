import java.util.HashSet;
import java.util.Scanner;

public class CheckTwoArray {

	public static boolean ifTwoArrayAreSame(char a[], char b[]) {
		HashSet<Character> s1=new HashSet<>();
		HashSet<Character> s2=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			s1.add(a[i]);
		}
		System.out.println(s1);
		for(int i=0;i<b.length;i++) {
			s2.add(b[i]);
		}
		System.out.println(s2);
		return s1.equals(s2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 1 String: ");
		String s1=sc.nextLine();
		System.out.println("Enter 2 String: ");
		String s2=sc.nextLine();
		char a[]= s1.toCharArray();
		char b[]= s2.toCharArray();
		System.out.println(ifTwoArrayAreSame(a,b));
		sc.close();
	}

}
