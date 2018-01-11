
public class Exercise_4 {

	public static void main(String[] args)
	{
		int a = 35;
		int b = 56;
		int c = 58;
		int n = 4;
		checkFermat(a, b, c, n);
	}
	
	public static void checkFermat(int a, int b, int c, int n)
	{
		double aSQ = Math.pow(a, n);
		double bSQ = Math.pow(b, n);
		double cSQ = Math.pow(c, n);
		if (aSQ + bSQ == cSQ && n > 2)
		{
			System.out.println("Holy smokes, Fermat was wrong!");
		}
		else
		{
			System.out.println("No that doesn't work.");
		}
	}

}
