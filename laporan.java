import java.util.Scanner;

class laporan{

public String no_lap;
public String tgl_lap;
public String jenis_lap;

public void cetak(){
 	
 	Scanner masuk = new Scanner(System.in); // Syntax Input //
 	System.out.println(" =======================================");
 	System.out.println("    		BUAT laporan ANDA ");
 	System.out.println(" =======================================");
 	System.out.print(" No laporan : "); no_lap = masuk.nextLine();
 	System.out.print(" Tanggal laporan : "); tgl_lap = masuk.nextLine();
 	System.out.print(" Jenis laporan : "); jenis_lap = masuk.nextLine();
	
	System.out.print(" No laporan : ");System.out.println(no_lap);
	System.out.print(" Tanggal laporan : ");System.out.println(tgl_lap);
	System.out.print(" Jenis laporan : ");System.out.println(jenis_lap);
}
public void ubah_lap(){
	this.no_lap = "TRX0002";
	this.tgl_lap = "29 Oktober 2017";
	this.jenis_lap = "penjualan";

	System.out.println(no_lap);
	System.out.println(tgl_lap);
	System.out.println(jenis_lap);


}
public void hapus_lap(){
	this.no_lap = "TRX0001";
	this.tgl_lap = "30 Oktober 2017";
	this.jenis_lap = "penjualan";

	System.out.println(no_lap);
	System.out.println(tgl_lap);
	System.out.println(jenis_lap);


}

}