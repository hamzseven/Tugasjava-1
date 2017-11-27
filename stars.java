import java.util.Scanner;
class stars{
	

	public static void main(String[] args) {
		int b;
		Scanner add = new Scanner(System.in);
		System.out.println(" Masukkan Angka :");
		b= add.nextInt(); 
		
		for (int i=0;i<b;i++){

            for(int j=0;j<b;j++){ //spasi
            	System.out.print("*");
                
            }
            
            System.out.println(" ");
        }
	}


}