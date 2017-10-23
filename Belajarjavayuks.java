import java.util.Scanner; // File Untuk Import //

public class Input4{ // Class Utama //

public static void main(String[] args) { // Method Main //
	
 	// Belajar Input //

 	Scanner kata = new Scanner(System.in); // Syntax Input //
 	String nama; // Identifikasi objek //
 	char jk;
 	int tb;
 	boolean menikah;

 	System.out.print(" Masukkan Nama Anda : ");
 	nama = kata.nextLine(); // untuk input di java //
 	System.out.print(" Jenis kelamin Anda: ");
 	jk = kata.next().charAt(0); // untuk input di java //
 	System.out.print(" Masukkan Tinggi Bada : ");
 	tb = kata.nextInt(); // untuk input di java //
 	System.out.print(" Masukkan Status Menikah : ");
 	menikah = kata.nextBoolean(); // untuk input di java //


 	System.out.println(" Nama Anda Adalah : ");
 	System.out.print(nama);

 }

}