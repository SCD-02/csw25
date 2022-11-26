import java.util.Scanner;

public class RemoveOccurences {

	public static String removeOccurences(String s,char k) {
		String ns="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=k) {
				ns=ns+s.charAt(i);
			}
		}
		return ns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 1 String: ");
		String s1=sc.nextLine();
		System.out.println("Enter char: ");
		String s2=sc.nextLine();
		System.out.println(removeOccurences(s1,s2.charAt(0)));
		sc.close();
	}

}
