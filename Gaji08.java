import java.util.Scanner;

public class Gaji08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jmlMasuk, jmlTdkMasuk,totGaji, gaji, potGaji;
        // int gaji =40000, potGaji =25000;

        System.out.println("Masukkan jumlah gaji harian anda :");
        gaji = input.nextInt();
        System.out.println("Masukkan jumlah potongan gaji harian anda :");
        potGaji = input.nextInt();
        System.out.println("Masukkan jumlah hari masuk kerja anda :");
        jmlMasuk = input.nextInt();
        System.out.println("Masukkan jumlah hari tidak masuk kerja anda :");
        jmlTdkMasuk = input.nextInt();

        totGaji = (jmlMasuk * gaji) - (jmlTdkMasuk*potGaji);

        System.out.println("Gaji yang anda terima adalah " + totGaji);
    }
}
