
public class ContainOnlyOddNO {

	public static boolean ifContainOddNo(int a[]) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 !=0) {
				count++;
			}
		}
		return count==a.length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,11,3,43,5};
		System.out.println(ifContainOddNo(a));
	}

}
