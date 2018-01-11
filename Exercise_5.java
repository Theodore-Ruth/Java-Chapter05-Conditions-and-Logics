
public class Exercise_5 {

	public static void main(String[] args) {
		singSong(99);
	}
	
	public static void singSong(int n)
	{
		if(n == 0)
		{
			System.out.println("no bottles of beer on the wall,");
			System.out.println("no bottles of beer,");
			System.out.println("ya' can't take one down, ya' can't pass it around,");
			System.out.println("cause there are no more bottles of beer on the wall!");
		}
		else
		{
			singVerse(n);
			singSong(n-1);
		}
		
		
	}
	
	public static void singVerse(int i)
	{
		System.out.println(i + " bottles of beer on the wall,");
		System.out.println(i + " bottles of beer,");
		System.out.println("ya' take one down, ya' pass it around,");
		System.out.println(i-1 + " bottles of beer on the wall.");
		System.out.println("");
		
	}

}
