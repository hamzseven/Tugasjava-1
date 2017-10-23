import java.util.Scanner; // File Untuk Import //

public class Input4{ // Class Utama //

public static void main(String[] args) { // Method Main //
	
 	// Belajar Input //

 	Scanner kata = new Scanner(System.in); // Syntax Input //
 	String nama; // Identifikasi objek //
 	char jk;
 	int tb;
 	boolean menikah;

 	System.out.println(" =======================================");
 	System.out.println("    		INFORMASI DATA ANDA ");
 	System.out.println(" =======================================");

 	System.out.print(" Masukkan Nama Anda : ");
 	nama = kata.nextLine(); // untuk input di java //
 	System.out.print(" Jenis kelamin Anda: ");
 	jk = kata.next().charAt(0); // untuk input di java //
 	System.out.print(" Masukkan Tinggi Bada : ");
 	tb = kata.nextInt(); // untuk input di java //
 	System.out.print(" Masukkan Status Menikah : ");
 	menikah = kata.nextBoolean(); // untuk input di java //


 	

 	System.out.print(" Nama Anda : ");System.out.println(nama);
 	System.out.print(" Jenis Kelamin : ");System.out.println(jk);
 	System.out.print(" Tinggi Badan : ");System.out.println(tb);
 	System.out.print(" Status : ");System.out.println(menikah);

 }

}