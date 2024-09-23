package main.codelab3;

public class HitungGaji {
    public int perhitunganGaji(int jamKerja, int gajiPerJam) {
        return jamKerja * gajiPerJam;
    }


    public static void main(String[] args) {
        HitungGaji hitung = new HitungGaji();

        int gajiTotal = hitung.perhitunganGaji(40, 250000);
        System.out.println("Gaji Karyawan dengan 40 Jam Kerja = " + gajiTotal);
    }
}
