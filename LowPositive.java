package lowestPositiveInteger;

public class LowPositive {
	
	public static void check(int[]a) {
		int temp;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	public static int solve(int[]a) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i+1]+a[i]<0) {
				System.out.println("skipped");
			}
			else if(a[i+1]-a[i]>1) {
				
				return a[i]+1;
				
			}
		
		}
		return a[a.length-1]+1;
	}

	public static void main(String[] args) {
		
		int[] a = new int[]{-1,0,1,3,4,5,6};
		LowPositive.check(a);

		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]);
		}
		System.out.println(LowPositive.solve(a));
		
	}

}
