public abstract class Barang{
    
    String kodeBarang;
    String namaBarang;

    public Barang(String kodeBarang, String namaBarang){
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
    }

    public String getkodeBarang(){
        return kodeBarang;
    }
    
    public void setkodeBarang(String kodeBarang){
        this.kodeBarang = kodeBarang;
    }

    public String getnamaBarang(){
        return namaBarang;
    }

    
    public void setnamaBarang(String namaBarang){
        this.namaBarang = namaBarang;
    }



    public abstract double hitungNilai();


    public void tampilkanInfo() {
        System.out.println("Informasi Barang:");
        System.out.println("Kode Barang : " + kodeBarang);
        System.out.println("Nama Barang : " + namaBarang);
    }
} 