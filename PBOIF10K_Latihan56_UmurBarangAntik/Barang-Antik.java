/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Umur Barang Antik
 */


public class BarangAntik {
    private int umur;
    
    public BarangAntik(int umur) {
        this.umur = umur;
    }
    
    public void tampilUmur() {
        System.out.println("Umur barang antik ini adalah : " + this.umur 
                + " tahun.");
    }
}