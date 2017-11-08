import java.util.Scanner;
public class fashion extends barang{

	public String namabarang;
	public String merk;
	public String variasiwarna;
	public String ukuran;

	public void inputfashion()
	{


	Scanner masuk = new Scanner(System.in); // Syntax Input //
 	System.out.println(" =======================================");
 	System.out.println("    	DATA FASHION ");
 	System.out.println(" =======================================");
 	System.out.print(" Nama Barang "); namabarang = masuk.nextLine();
 	System.out.print(" merk : "); merk = masuk.nextLine();
 	System.out.print(" Ukuran : "); ukuran = masuk.nextLine();
 	System.out.print(" Variasi Warna : "); variasiwarna = masuk.nextLine();
 	
	}

	public static void fash() {

		fashion cal = new fashion();
		cal.urutbarang();
		cal.inputfashion();
		cal.nominalbarang();
	}

}