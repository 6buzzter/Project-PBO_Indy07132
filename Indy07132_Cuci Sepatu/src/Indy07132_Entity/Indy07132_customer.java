package Indy07132_Entity;
public class Indy07132_customer extends Indy07132_toko {

    public String nama,alamat;
    private String merksepatu;

    public Indy07132_customer(String nama, String alamat, String merksepatu,String jeniscuci,String harga) {
        super (jeniscuci,harga);
        this.nama = nama;
        this.alamat = alamat;
        this.merksepatu = merksepatu;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setMerksepatu(String merksepatu) {
        this.merksepatu = merksepatu;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getMerksepatu() {
        return merksepatu;
    }
    @Override
    public String getJeniscuci() {
        return jeniscuci;
    } 
    @Override
    public String getHarga() {
        return harga;
    }

}
