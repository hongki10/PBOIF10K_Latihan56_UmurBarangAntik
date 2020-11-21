/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Umur Barang Antik
 */

 public class Radio extends BarangAntik {
    private String name;
    
    public Radio(int umur) {
        super(umur);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
