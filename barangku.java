import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class  barangku{

    public static void koleksibarang() throws IOException {
        try{
           Scanner pilmenu = new Scanner(System.in);
           Scanner opt = new Scanner(System.in);


           String opsi = " ";

           do{
            System.out.println("");
           System.out.println(" DAFTAR INPUT BARANG : ");
           System.out.println("1. Elektronik");
           System.out.println("2. Makanan");
           System.out.println("3. Fashion");

           System.out.print("Pilihan Anda :");

           int menu = pilmenu.nextInt();
           switch (menu){
            case 1 : 

                      elektronik lapo = new elektronik();
                      lapo.elek();
                     break;
            case 2 :  makanan emam = new makanan();
                      emam.mak();
                     break;
            case 3 :  fashion pakaian= new fashion();
                      pakaian.fash();
                     break;

            default : 
                      System.out.println("");
                    System.out.println("Maaf Menu Tidak Ada Dalam Pilihan !");
        }

            System.out.println("Ingin kembali ke Menu ");
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
