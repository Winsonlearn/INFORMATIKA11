import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);

        System.out.printf("Masukkan Nama Barang: ");
        String nama_b = inputan.nextLine();

        System.out.printf("Masukkan Harga Barang: ");
        int harga_b = inputan.nextInt();
        
        System.out.printf("Masukkan Jumlah Barang: ");
        int jumlah_b = inputan.nextInt();
        
        System.out.println("\n");

        NotaPenjualan(nama_b, harga_b, jumlah_b);
       
        

    }

    private static void NotaPenjualan(String nama_b, int harga_b, int jumlah_b) {
        System.out.println("-------------- NOTA PENJUALAN ------------- ");
        System.out.println("Nama Barang             : " + nama_b);
        System.out.println("Harga Barang            : Rp." + harga_b);
        System.out.println("Jumlah Barang           : " + jumlah_b);
        System.out.println("-------------------------------------------- ");
        double subtotal = harga_b * jumlah_b;
        double diskon;

        System.out.println("Subtotal Harga          : Rp." + String.format("%.0f", subtotal));
        System.out.println("Tentukan Jenis Diskon : ");
        System.out.println("1. Fibonacci (1)      : ");
        System.out.println("2. Normal (2)         : ");
        Scanner inputan = new Scanner(System.in);
        int opsi = inputan.nextInt();
        if (opsi == 1) {            
            diskon = fibonacci_rekursif(5) * 0.01;
        }

        else if(opsi == 2){
            if (subtotal < 10000) {
                diskon = 0.10;
            }
            else {
                diskon = 0.20;
            }
        }
        else{
            if (subtotal < 10000) {
                diskon = 0.10;
            }
            else {
                diskon = 0.20;
            }
        }
        System.out.println("Diskon                  : " + diskon + "%");
        double total = Math.abs(subtotal - (subtotal * diskon));

        System.out.println("-------------------------------------------- ");
        System.out.println("Total                   : Rp." + String.format("%.0f", total));
        System.out.println("-------------------------------------------- ");
        System.out.println("Tentukan Jenis Pembayaran: ");
        System.out.println("1. TUNAI (1)          : ");
        System.out.println("2. TRANSFER (2)       : ");
        int pilihan = inputan.nextInt();
        if (pilihan == 1) {            
            System.out.println("Silahkan Membayar Tunai");
        }
        else if(pilihan == 2){
            System.out.println("Silahkan Transfer ke nomor rekening 090909");
        }
        else{
            System.out.println("Pilihan tidak tersedia");
        }
        System.out.println("-------------------------------------------- ");
        System.out.println("Terima kasih telah berbelanja!!");
    }

    private static int fibonacci_rekursif(int num)
       {
           if (num == 0 || num == 1)
           {
               return num;
           }
           else
           {
               return fibonacci_rekursif(num - 1) + fibonacci_rekursif(num - 2);
           }
       }
}
