import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

class main{

    public static void main(String[] args) throws IOException {
        try{
           Scanner pilmenu = new Scanner(System.in);
           Scanner opt = new Scanner(System.in);


           String opsi = " ";

           do{
            System.out.println("");
           System.out.println(" DAFTAR MENU : ");
           System.out.println("1. Laporan");
           System.out.println("2. Barang");
          
           System.out.print("Pilihan Anda :");

           int menu = pilmenu.nextInt();
           switch (menu){
            case 1 : 

                      laporan lapo = new laporan();
                      lapo.cetak();
                     break;
            case 2 :  barangku brg = new barangku();
                      brg.koleksibarang();
                     break;

            default : 
                      System.out.println("");
                    System.out.println("Maaf Menu Tidak Ada Dalam Pilihan !");
        }

            System.out.println("Ingin kembali ke Menu Utama ");
            System.out.println("Tekan 'Y' untuk Ya dan 'N' untuk Tidak");


            opsi = opt.nextLine();
                }
           while (opsi.equals("y") || opsi.equals("Y"));
            }

        catch(InputMismatchException IME){
            System.out.println("Maaf salah input!");
        }
    }
}
