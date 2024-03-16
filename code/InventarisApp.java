import java.util.ArrayList;

public class InventarisApp {
    
    private ArrayList<Barang> inventarisApp;

    public InventarisApp() { 
        inventarisApp = new ArrayList<>();
    }

    public void tambahBarang(Barang inventaris){
        inventarisApp.add(inventaris);
        System.out.println("Barang berhasil ditambahkan ke inventaris");    
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

    public void hitungTotalInventaris(){
        
    }
}
