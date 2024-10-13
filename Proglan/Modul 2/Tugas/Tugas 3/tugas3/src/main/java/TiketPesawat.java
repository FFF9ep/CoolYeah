import Tugas.tgs4.info;

public class TiketPesawat extends Tugas.tgs4.Pemesanan implements Tugas.tgs4.Tiket {
    protected String nama;
    private String asal;
    protected String tujuan;
    private double Tiket;
    protected double diskon;

    public TiketPesawat(info info){
        this.nama = info.nama();
        this.asal = info.asal();
        this.tujuan = info.tujuan();
        this.Tiket = info.hargaTiket();
        this.diskon = info.diskon();
    }

    @Override
    public double hargaBiayaTiket(){
        return Tiket - (Tiket * (diskon / 100));
    }

    @Override
    public double hitungDiskon() {
        return Tiket * (diskon / 100);
    }

    @Override
    public void tampilkanInformasi(){
        System.out.println("Nama Penumpang : " + nama);
        System.out.println("Asal : " + asal);
        System.out.println("Tujuan : " + tujuan);
        System.out.println("Harga Tiket : "+ Tiket);
        System.out.println("Diskon : " + diskon + "%");
        System.out.println("Biaya Tiket Setelah Diskon : " + hargaBiayaTiket());
        System.out.println("Jumlah Diskon : " + hitungDiskon());
    }
}
