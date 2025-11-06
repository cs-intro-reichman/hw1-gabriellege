// Generates three integer random numbers in a given range,
// and prints them in increasing order.

public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * lim) + 1;
		int b = (int) (Math.random() * lim) + 1;
		int c = (int) (Math.random() * lim) + 1;
		
		int min = Math.min(Math.min(a,b),c);
		int mid = Math.max(Math.min(a,b),Math.min(a,c));
		int max = Math.max(Math.max(a, b),c);
		
		System.out.println(min + " " +mid + " " +max);
	}
}
