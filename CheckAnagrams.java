import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagrams {
	
	public static boolean ifAnagram(String s1,String s2) {
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		int count1[]=new int[256];
		Arrays.fill(count1, 0);
		int count2[]=new int[256];
		Arrays.fill(count2, 0);
		for(int i=0;i<a.length && i<b.length;i++) {
			count1[a[i]]++;
			count2[b[i]]++;
		}
		if(a.length!=b.length) {
			return false;
		}
		
		for(int i=0;i<count1.length;i++) {
			if(count1[i]!=count2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 1 String: ");
		String s1=sc.nextLine();
		System.out.println("Enter 2 String: ");
		String s2=sc.nextLine();
		System.out.println(ifAnagram(s1,s2));
		sc.close();
	}

}
