import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckVowel {

	public static boolean findVowel(String s) {
		
		Pattern pattern=Pattern.compile("[aeiouAEIOU]");
		Matcher matcher=pattern.matcher(s);
		return matcher.find();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the INPUT:");
		String s=sc.nextLine();
		System.out.println(findVowel(s));
		sc.close();
	}

}
