package OOP.src;

public class Buah {
    private String nama;
    private int harga;
    private int stock;

    public Buah(String nama, int harga, int stock) {
        setNama(nama);
        setHarga(harga);
        setStock(stock);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama.length() == 0) {
            throw new IllegalArgumentException("nama cannot be null");
        }
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        if (harga < 0) {
            throw new IllegalArgumentException("Harga cannot be below 0");
        }
        this.harga = harga;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Stock cannot be below 0");
        }
        this.stock = stock;
    }

}