import java.util.Scanner;

/**
 * Program ini memungkinkan pengguna untuk melakukan pembelian barang di Toko Teknologi.
 * Pengguna dapat memilih komputer, mouse, dan/atau keyboard serta menentukan jumlah yang akan dibeli.
 * Program akan menghitung total biaya dan menampilkan hasilnya kepada pengguna.
 */

public class PembelianBarang {

    /**
     * Metode utama program.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hargaKomputer = 1000000.0;
        double hargaMouse = 200000.0;
        double hargaKeyboard = 500000.0;
        double totalBiaya = 0.0;

        System.out.println("Selamat datang di Toko Teknologi!");
        System.out.println("Harga Barang:");
        System.out.println("1. Komputer - Rp " + hargaKomputer);
        System.out.println("2. Mouse - Rp " + hargaMouse);
        System.out.println("3. Keyboard - Rp " + hargaKeyboard);

        while (true) {
            System.out.print("Pilih barang yang akan dibeli (1/2/3): ");
            int pilihan = scanner.nextInt();

            if (pilihan == 1) {
                System.out.print("Jumlah komputer yang akan dibeli: ");
                int jumlahKomputer = scanner.nextInt();
                totalBiaya += hargaKomputer * jumlahKomputer;
            } else if (pilihan == 2) {
                System.out.print("Jumlah mouse yang akan dibeli: ");
                int jumlahMouse = scanner.nextInt();
                totalBiaya += hargaMouse * jumlahMouse;
            } else if (pilihan == 3) {
                System.out.print("Jumlah keyboard yang akan dibeli: ");
                int jumlahKeyboard = scanner.nextInt();
                totalBiaya += hargaKeyboard * jumlahKeyboard;
            } else {
                System.out.println("Pilihan tidak valid.");
            }

            System.out.print("Apakah Anda ingin membeli barang lain? (ya/tidak): ");
            String ulangi = scanner.next();

            if (!ulangi.equalsIgnoreCase("ya")) {
                break;
            }
        }

        System.out.println("Terima kasih telah berbelanja di Toko Teknologi!");
        System.out.println("Total Biaya Keseluruhan: Rp " + totalBiaya);

        scanner.close();
    }
}
