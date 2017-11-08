import java.util.Scanner;

public class barang 
{
	public String no;
	public String idbarang;
	public String hargasatuan;
	public String totalbarang;
	public String jumlahharga;

	public void urutbarang(){
	Scanner masuk = new Scanner(System.in); // Syntax Input //
 	System.out.println(" =======================================");
 	System.out.println(" ************DATA BARANG****************");
 	System.out.println(" =======================================");
 	System.out.print(" No "); no = masuk.nextLine();
 	System.out.print(" Id barang : "); idbarang = masuk.nextLine();
}

	public void nominalbarang(){
	Scanner masuk = new Scanner(System.in); // Syntax Input //	
	System.out.print(" Harga Satuan : "); hargasatuan = masuk.nextLine();
 	System.out.print(" total barang : "); totalbarang = masuk.nextLine();
 	System.out.print(" Total Harga : "); jumlahharga = masuk.nextLine();
}
}