class BarangPakaian extends Barang {
    private double hargaSatuan;
    private int jumlah;

    public BarangPakaian(String kodeBarang, String namaBarang, double hargaSatuan, int jumlah) {
        super(kodeBarang, namaBarang);
        this.hargaSatuan = hargaSatuan;
        this.jumlah = jumlah;
    }

    // Implementasi metode hitungNilai() sesuai dengan jenis barang
    @Override
    public double hitungNilai() {
        return hargaSatuan * jumlah;
    }
}