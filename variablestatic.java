public class variablestatic{

	public static String nama;
	private String namaPrivate;

	public static void main(String[] args) {
		variablestatic var = new variablestatic();
		var.namaPrivate = "Ini private";
		variablestatic.nama = "Ini static";

		System.out.println(var.namaPrivate);
		System.out.println(variablestatic.nama);
	}
}