package lab2;

public class maxnum {
	public static double max(double x, double y)  {
		double z;
		if (x > y) {
			z = x;
		} else {
			z = y;
		}
		return z;
	}
	public static int max(int x, int y)  {
		int z;
		if (x > y) {
			z = x;
		} else {
			z = y;
		}
		return z;
	}
	public static double max(double x, int y)  {
		double z;
		if (x > y) {
			z = x;
		} else {
			z = y;
		}
		return z;
	}
	public static double max(int x, double y)  {
		double z;
		if (x > y) {
			z = x;
		} else {
			z = y;
		}
		return z;
	}
	
	public static void main(String[] args) {
		System.out.println(max(5.2,5.1));
		System.out.println(max(5,4.9));
		System.out.println(max(5.2,5));
		System.out.println(max(5,5));
	}
}
