public class Main {
    public static void main(String[] args) {

        int hargaBarang = 2000;
        int jumlahBarang = 0;

        try {
            int result = hargaBarang / jumlahBarang;
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        
        InventarisApp<BarangElektronik> inventarisElektronik = new InventarisApp<>();
        BarangElektronik barang1 = new BarangElektronik("E01", "Handphone", 6_000_000.0, 2);
        BarangElektronik barang2 = new BarangElektronik("E02", "Playstation", 4_000_000.0, 1);
        inventarisElektronik.tambahBarang(barang1);
        inventarisElektronik.tambahBarang(barang2);
        

        System.out.println("Daftar Barang Elektronik:");
        inventarisElektronik.tampilkanDaftarBarang();
        System.out.println("Total Nilai Inventaris Elektronik: " + inventarisElektronik.hitungTotalInventaris());

        InventarisApp<BarangPakaian> investarisPakaian = new InventarisApp<>();
        BarangPakaian pakaian1 = new BarangPakaian("P01", "Sweater", 5_00_000.0, 1);
        BarangPakaian pakaian2 = new BarangPakaian("P02", "Sepatu", 250_000.0, 4);
        investarisPakaian.tambahBarang(pakaian1);
        investarisPakaian.tambahBarang(pakaian2);

        System.out.println("\nDaftar Barang Pakaian:");
        investarisPakaian.tampilkanDaftarBarang();
        System.out.println("Total Nilai Inventaris Elektronik: " + investarisPakaian.hitungTotalInventaris());

    }
}
