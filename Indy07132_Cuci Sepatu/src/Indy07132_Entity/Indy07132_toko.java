package Indy07132_Entity;

public abstract class Indy07132_toko {
    protected String jeniscuci,harga;


    public Indy07132_toko(String jeniscuci, String harga) {
        this.jeniscuci = jeniscuci;
        this.harga = harga;
    }

    public abstract String getJeniscuci();
    
    public abstract String getHarga();
    
    public void setJeniscuci(String jeniscuci){
        this.jeniscuci = jeniscuci;
    }
    
    public void setHarga(String harga) {
        this.harga = harga;
    }

}
