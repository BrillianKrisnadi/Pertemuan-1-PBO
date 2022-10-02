import java.util.Scanner;
public class pegawaiMain {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masuukkan nama : " );
        String nama = sc.nextLine();
        System.out.print("Masuukkan Nip : ");
        int i = sc.nextInt();
        System.out.print("Masukkan Jumlah Jam Kerja : ");
        int jumlahJamKerja = sc.nextInt();
        pegawai pg = new pegawai(nama, i, jumlahJamKerja);

        System.out.println("");

        pg.gajiPokok();
        pg.setLembur();
        pg.uangMakan();
        pg.uangTransport();

        pg.cetakPenghasilan();
        

    
    }
}
