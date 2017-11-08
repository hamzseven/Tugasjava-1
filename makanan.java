import java.util.Scanner;
public class makanan extends barang{

	public String namamakanan;
	public String berat;
	public String exp;
	public String rasa;

	public void inputmakanan()
	{


	Scanner masuk = new Scanner(System.in); // Syntax Input //
 	System.out.println(" =======================================");
 	System.out.print(" Nama Makanan "); namamakanan = masuk.nextLine();
 	System.out.print(" Berat Kemasan : "); berat = masuk.nextLine();
 	System.out.print(" Expired : "); exp = masuk.nextLine();
 	System.out.print(" Rasa : "); rasa = masuk.nextLine();
 	
	}

	public static void mak() {

		makanan cal = new makanan();
		cal.urutbarang();
		cal.inputmakanan();
		cal.nominalbarang();
	}

}