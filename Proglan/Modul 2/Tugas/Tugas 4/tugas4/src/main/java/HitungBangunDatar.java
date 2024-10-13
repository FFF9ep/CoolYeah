import java.util.Scanner;

public class HitungBangunDatar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        double sisi = scanner.nextDouble();
        double luasPersegi = sisi * sisi;
        System.out.println("Luas persegi adalah: " + luasPersegi);

        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = scanner.nextDouble();
        double luasPersegiPanjang = panjang * lebar;
        System.out.println("Luas persegi panjang adalah: " + luasPersegiPanjang);

        scanner.close();
    }
}
