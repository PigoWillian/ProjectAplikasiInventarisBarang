// Kelas konkret BarangElektronik
class BarangElektronik extends Barang {
    private double harga;
    private int jumlah;

    public BarangElektronik(String kodeBarang, String namaBarang, double harga, int jumlah) {
        super(kodeBarang, namaBarang);
        this.harga = harga;
        this.jumlah = jumlah;
    }

    @Override
    public double hitungNilai() {
        return harga * jumlah;
    }
}

// Kelas konkret BarangPakaian
class BarangPakaian extends Barang {
    private double hargaSatuan;
    private int jumlah;

    public BarangPakaian(String kodeBarang, String namaBarang, double hargaSatuan, int jumlah) {
        super(kodeBarang, namaBarang);
        this.hargaSatuan = hargaSatuan;
        this.jumlah = jumlah;
    }

    @Override
    public double hitungNilai() {
        return hargaSatuan * jumlah;
    }
}
