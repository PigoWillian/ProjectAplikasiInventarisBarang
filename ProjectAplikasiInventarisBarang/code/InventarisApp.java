import java.util.ArrayList;

public class InventarisApp<T extends Barang> {
    
    private ArrayList<T> inventarisApp;

    public InventarisApp() { 
        inventarisApp = new ArrayList<>();
    }

    public void tambahBarang(T barang) {
        inventarisApp.add(barang);
    }

    public void tampilkanDaftarBarang() {
        for (T barang : inventarisApp) {
            System.out.println("Kode Barang: " + barang.getkodeBarang() +
                    ", Nama Barang: " + barang.getnamaBarang() +
                    ", Nilai Barang: " + barang.hitungNilai());
        }
    }

        public void tampilkanBarang(){
            System.out.println("\nDaftar Barang");

        if (inventarisApp.isEmpty()) {
            System.out.println("Daftar barang kosong.");
        } else {
            for (Barang inventaris : inventarisApp) {
                inventaris.tampilkanInfo();
                System.out.println("------------------------");
            }
        }
    }

    public double hitungTotalInventaris() {
        double totalNilai = 0;
        for (T barang : inventarisApp) {
            totalNilai += barang.hitungNilai();
        }
        return totalNilai;
    }
}
