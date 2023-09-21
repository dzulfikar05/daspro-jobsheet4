import java.util.Scanner;

public class HargaBayar08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String merk;
        int harga, jumlah, jmlHal;
        double dis, total, bayar, jmlDis;

        System.out.println("Masukkan merk buku :");
        merk = input.nextLine();
        System.out.println("Masukkan jumlah halaman buku :");
        jmlHal = input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli :");
        harga = input.nextInt();
        System.out.println("Masukkan diskon (satuan persen, ex. 10) : ");
        dis = input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli :");
        jumlah = input.nextInt();

        total = harga * jumlah;
        jmlDis = total * dis / 100;
        bayar = total - jmlDis;

        System.out.println("Merk Buku " + merk);
        System.out.println("Jumlah Halaman Buku " + jmlHal);
        System.out.println("Jumlah yang anda beli " + jumlah);
        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);
    }
}
