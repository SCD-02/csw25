import java.util.Scanner;

public class Q15 {
	
	public static int powerToPower(int x, int y) {
		if(x==0) {
			return 0;
		}
		if(x==0&&y==0) {
			return -1;
		}
		if(y==0) {
			return 1;
		}
		return x*powerToPower(x,y-1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the 3 no: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		System.out.println(powerToPower(powerToPower(x,y),z));
		sc.close();

	}

}
