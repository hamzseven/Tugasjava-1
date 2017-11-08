import java.util.Scanner;
public class elektronik extends barang{

	public String namabarang;
	public String type;
	public String merk;
	public String dimensi;

	public void inputbarangelektronik()
	{


	Scanner masuk = new Scanner(System.in); // Syntax Input //
 	System.out.println(" =======================================");
 	System.out.print(" Nama Barang "); namabarang = masuk.nextLine();
 	System.out.print(" type : "); type = masuk.nextLine();
 	System.out.print(" merk : "); merk = masuk.nextLine();
 	System.out.print(" dimensi : "); dimensi = masuk.nextLine();
 	
	}

	public static void elek() {

		elektronik cal = new elektronik();
		cal.urutbarang();
		cal.inputbarangelektronik();
		cal.nominalbarang();
	}

}