/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Umur Barang Antik
 */

 public class Latihan56UmurBarangAntik {
     
    public static void main(String[] args) {
        Radio radio = new Radio(234);
        radio.setName("Radio AM");
        
        System.out.println("Nama barang antik : " + radio.getName());
        radio.tampilUmur();
    }
    
}