
public class pegawai {
    private String Nama;
    private String Nip;
    private double gajiPokok;
    private double lembur;
    private int uangMakan;
    private double transport;
    private int jumlahJamKerja;
    private double total;

   
    
    pegawai(String Nama , int i, int jumlahJamKerja){
        this.Nama = Nama;
        this.Nip = Nip;
        this.jumlahJamKerja = jumlahJamKerja;
    }

    public void gajiPokok(){
        gajiPokok = 2000 * jumlahJamKerja;
    }

    public void setLembur(){
        if(jumlahJamKerja > 7){
            lembur = (jumlahJamKerja - 7) * (1.5 * gajiPokok);
        }else{
            lembur = 0;
        }
    }

    

    public void uangMakan(){
        if(jumlahJamKerja >= 8){
            uangMakan = 3500;
        }else{
            uangMakan = 0;
        }
    }

    public void uangTransport(){
        if(jumlahJamKerja >= 9){
            transport = 4000;
        }else{
            transport = 0;
        }
    }

    public void cetakPenghasilan(){
        total = lembur + gajiPokok + uangMakan + transport;
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Lembur: " + lembur);
        System.out.println("Uang Makan: " + uangMakan);
        System.out.println("Uang Transport: " + transport);
        System.out.println("Total: " + total);
    }
   
}
