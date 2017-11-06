public class calculatormain {

	public void perkalian(int x, int y)

	{

		z = x * y;
		System.out.println("hasil :" + z);

	}

	public static void main(String[] args) {
		int a = 20, b = 10;
		calculatormain cal = new calculatormain();
		cal.pertambahan(a,b);
		cal.pengurangan(a,b);
		cal.perkalian(a,b);
	}

}